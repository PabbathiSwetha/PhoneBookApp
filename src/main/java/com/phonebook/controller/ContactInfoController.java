package com.phonebook.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.phonebook.entity.Contact;
import com.phonebook.service.ContactService;

@Controller
public class ContactInfoController {
	private ContactService service;
	
	public ContactInfoController(ContactService service) {
		this.service = service;
	}
	@GetMapping("/load-form")
	public String loadForm(Model model) {
		System.out.println("1");
		Contact cobj = new Contact();
		model.addAttribute("contact", cobj);		
		return "contact";
	}
	
	@PostMapping("/saveContact")
	public String handleSubmitBtn(Contact contact, Model model) {
		boolean isSaved = service.saveOrUpdateContact(contact);
		if(isSaved) {
			model.addAttribute("succMsg", "Contact Saved");
		}
		else {
			model.addAttribute("FailMsg", "Failed to save contact");
		}
		return "contact";
	} 
	
	  @GetMapping("/view-contacts") 
	  public String handleViewsContactHyperlink(Model model) {
	  
	  List<Contact> allContacts = service.getAllContacts();
	  model.addAttribute("contacts", allContacts);
	  
	  return "contacts-display";
	  
	  }
	 
}
