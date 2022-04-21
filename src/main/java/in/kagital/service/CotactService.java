package in.kagital.service;

import java.util.List;

import in.kagital.entity.Contact;

public interface CotactService {
	
	String upsert(Contact contact);
	
	List<Contact> getAllContacts();
	
	Contact getContact(int cid);
	
	String deleteContact(int cid);
}
