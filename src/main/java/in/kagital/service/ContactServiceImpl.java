package in.kagital.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.kagital.entity.Contact;
import in.kagital.repository.ContactRepository;

@Service
public class ContactServiceImpl implements CotactService {
	
	@Autowired
	private ContactRepository contactRepo;

	public String upsert(Contact contact) {
		Contact save = contactRepo.save(contact);		
		return "SUCCESS";
	}

	public List<Contact> getAllContacts() {
		return contactRepo.findAll();
	}

	public Contact getContact(int cid) {
		Optional<Contact> findById = contactRepo.findById(cid);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	public String deleteContact(int cid) {
		contactRepo.deleteById(cid);
		return "SUCCESS";
	}

}
