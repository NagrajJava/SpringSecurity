package Nag.CustomerService;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public interface CustomerServivceRepo extends JpaRepository<Customer, Integer>{

	Customer findByFirstName(String firstname);

	//Optional<Customer> findById(Long mobileNumber);

	

	

	
	 
      
}
