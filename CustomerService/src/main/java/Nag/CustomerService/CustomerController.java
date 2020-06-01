package Nag.CustomerService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("Get")
public class CustomerController {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CustomerServivceRepo customerServiceRepo;

	CustomerInfo customerInfo = new CustomerInfo();
   	
	@RequestMapping("CustomerInfo/{firstname}")
	public List<Customer> getCustomerInfo(@PathVariable("firstname") String firstname) {

		RestTemplate restTemplate = new RestTemplate();

		      Customer customer = customerServiceRepo.findByFirstName(firstname);
		logger.info("Customer info is _->{}", customer);
		Mobilecombine mobilenum = restTemplate.getForObject(
				"http://localhost:8003/GetMobileInfo/GetMobilenosByNames/" + firstname,
				Mobilecombine.class);
		logger.info("MOBILE NUMBER INFO ->{}", mobilenum);
		   		    	 
		    	 return  mobilenum.getMobilenumbers().parallelStream().map(mobilen ->
		    	  {
		    		  CustomerAddress  custaddr = restTemplate.getForObject(
				  				"http://localhost:8002/GetAddress/" + firstname,
				  				CustomerAddress.class);
			    	  logger.info("CustomerAddress Info ->{}",custaddr);    		
		    		  return new Customer(34,customer.getFirstName(),customer.getMiddleName(),customer.getLastName(),
		    			mobilen.getMobileNumber(),custaddr.getAddressLine(),custaddr.getCity(),custaddr.getState(),
		   	    	 custaddr.getCountry(),custaddr.getZipCode());
		    		  		    	
		    }).collect(Collectors.toList());
		
   	}
		
	@RequestMapping("age/{age}")
	public Optional<Customer> getPersonByMobileNmber(@PathVariable("age") Integer age) {
		Optional<Customer> cust = customerServiceRepo.findById(age);
		logger.info("Customer info ->{}", cust);
		return cust;
	}

}
