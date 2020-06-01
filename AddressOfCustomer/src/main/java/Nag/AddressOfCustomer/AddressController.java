package Nag.AddressOfCustomer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    
	
	@Autowired
	AddressRepo addressRepo;
	
	@GetMapping("GetAddress/{firstname}")
	public List<CustomerAddress> getCustomerAddress(@PathVariable("firstname") String firstname)
	{
		//addressRepo.findByZipcode(zipCode);
		
		List<CustomerAddress> CustomerAddres =  addressRepo.findByFirstName(firstname);
		return CustomerAddres;
			
	}
	
	@RequestMapping(value ="saveAddress" , method =RequestMethod.POST)
	public  void saveCustomerAddress(@RequestBody CustomerAddress customerAddress)
	{
		//addressRepo.findByZipcode(zipCode);
		
		addressRepo.save(customerAddress);

			
	}
}
