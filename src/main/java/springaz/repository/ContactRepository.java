package springaz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springaz.entity.ContactEntity;

public interface ContactRepository extends JpaRepository<ContactEntity,Long> {  
	
	

}
