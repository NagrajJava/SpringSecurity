package Nag.MobileNumbersOfCustomer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MobileNosRepo extends JpaRepository<MobileNumbers, Long>{

	List<MobileNumbers> findByFirstName(String firstname);
	//MobileNumbers findByFirstName(String firstname);
	//findByFirstNameAndfindByLastName(String firstname,String lastname);

}
