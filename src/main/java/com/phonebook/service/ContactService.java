package com.phonebook.service;

import java.util.List;
import java.util.Optional;

import com.phonebook.entity.Contact;

public interface ContactService {
	
	public boolean saveOrUpdateContact(Contact contact);

	public List<Contact> getAllContacts();
	
	public Contact getContactById(Integer id);
	
	public boolean deleteById(Integer id);
	
}
