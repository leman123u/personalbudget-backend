package springaz.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import springaz.entity.ContactEntity;
import springaz.service.ContactService;

@RestController

@RequestMapping("/api/v1/contact")
@CrossOrigin("http://localhost:3000")
public class ContactController {
	
	
	@Autowired
	 private   ContactService contactService;


	    @GetMapping
	    public List<ContactEntity> getAllContacts() {
	        return contactService.getAllContact();
	    }

	    @GetMapping("/{id}")
	    public ContactEntity getContactById(@PathVariable Long id) {
	        return contactService.getContactById(id);
	    }

	    @PostMapping
	    public ContactEntity createContact(@RequestBody ContactEntity contact) {
	        return contactService.createContact(contact);
	    }

	    @PutMapping("/{id}")
	    public ContactEntity updateContact(@PathVariable Long id, @RequestBody ContactEntity contact) {
	        return contactService.updateContact(id, contact);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void>deleteContact(@PathVariable Long id) {
	        contactService.deleteContact(id);
	        return ResponseEntity .noContent().build();
	    }

}
	
	
	
	


