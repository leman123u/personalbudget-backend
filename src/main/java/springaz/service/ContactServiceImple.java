package springaz.service;

import java.util.List;

import springaz.entity.ContactEntity;

public interface ContactServiceImple {
	List<ContactEntity> getAllContact();


    ContactEntity getContactById(Long id);

    ContactEntity createContact(ContactEntity contact);

    ContactEntity updateContact(Long id, ContactEntity contact);

    void deleteContact(Long id );
	

}
