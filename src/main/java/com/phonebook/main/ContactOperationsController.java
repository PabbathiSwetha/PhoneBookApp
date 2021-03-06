package com.phonebook.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactOperationsController {
	
	private ContactService service;

	public ContactOperationsController(ContactService service) {
		this.service = service;
	}
	
	@GetMapping("/edit")
	public String editContact(@RequestParam("cid") Integer contactId, Model model) {
		Contact contactObj = service.getContactById(contactId);
		model.addAttribute("contact", contactObj);
		return "contact";
	}
	@GetMapping("/delete")
	public String deleteContact(@RequestParam("cid") Integer contactId, Model model) {
			boolean isdeleted = service.deleteById(contactId);
			if(isdeleted) {
				model.addAttribute("succMsg", "Contact deleted");
			}
			else {
				model.addAttribute("FailMsg", "Failed to delete contact");
			}
			return "redirect:view-contacts";
	}
	
}
