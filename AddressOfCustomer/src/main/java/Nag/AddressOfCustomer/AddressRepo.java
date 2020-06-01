package Nag.AddressOfCustomer;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<CustomerAddress, Long>{


	List<CustomerAddress> findByFirstName(String firstname);

	
	
}
