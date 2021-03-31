package com.phonebook.main;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService{
	   private ContactRepo repository;
	
	public ContactServiceImpl(ContactRepo repository) {
		this.repository = repository;
	}

	@Override
	public boolean saveOrUpdateContact(Contact contact) {
		Contact savedObj = repository.save(contact);				
		return savedObj.getContactId()!= null;
		
	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> contacts = repository.findAll();
		return contacts;
	}

	@Override
	public Contact getContactById(Integer id) {
		Optional<Contact> findById = repository.findById(id);
		if(findById.isPresent())
			return findById.get();
		return null;
	}

	@Override
	public boolean deleteById(Integer id) {
		boolean isDeleted=false;
		try {
			repository.deleteById(id);
			isDeleted=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isDeleted;
	}

}
