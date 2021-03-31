package com.phonebook.main;

import java.util.List;
import java.util.Optional;

public interface ContactService {
	
	public boolean saveOrUpdateContact(Contact contact);

	public List<Contact> getAllContacts();
	
	public Contact getContactById(Integer id);
	
	public boolean deleteById(Integer id);
	
}
