package in.kagital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.kagital.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact,Integer>{

}
