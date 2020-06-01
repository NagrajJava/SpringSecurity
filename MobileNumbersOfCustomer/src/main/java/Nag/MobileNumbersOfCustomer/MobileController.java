package Nag.MobileNumbersOfCustomer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("GetMobileInfo")
public class MobileController 
{
	Logger logger = LoggerFactory.getLogger(this.getClass());
       @Autowired
      MobileNosRepo  mobileNosRepo;
       @Autowired
       Mobilecombine mobilecomib = new Mobilecombine();
      
      @RequestMapping(value ="GetMobilenos/{mobilenum}",method = RequestMethod.POST)
   public void getMobilenumbers(@RequestBody MobileNumbers mobilenum)
   {
    	mobileNosRepo.save(mobilenum);
	   
   }      
      @RequestMapping(value ="GetMobilenos")
      public List<MobileNumbers> getAllMobilenumbers()
      {
       	
    	 List<MobileNumbers> mblall = mobileNosRepo.findAll();
   	   
    	  return mblall;
      }
      
      @RequestMapping("GetMobilenos/{MobileNumber}")
   public MobileNumbers getMobilenumber(@PathVariable("MobileNumber") Long MobileNumber)
   {
    	  MobileNumbers mobilenumber = mobileNosRepo.findById(MobileNumber).orElse(null);
    	  logger.info("Mobile Number Coming or not ->{}",mobilenumber);
	   return  mobilenumber;
   }
      
	
	/*
	 * @RequestMapping("GetMobilenosByName/{firstname}") public MobileNumbers
	 * getMobilenumberbyname(@PathVariable("firstname") String firstname) {
	 * MobileNumbers firstnameofcust = mobileNosRepo.findByFirstName(firstname);
	 * logger.info("Mobile Number Coming or not ->{}",firstnameofcust); return
	 * firstnameofcust; }
	 */
	 
      
	
	  @RequestMapping("GetMobilenosByNames/{firstname}") public Mobilecombine
	  getMobilenumberbynames(@PathVariable("firstname") String firstname) {
	  List<MobileNumbers> firstnameofcust =
	  mobileNosRepo.findByFirstName(firstname);
	  logger.info("Mobile Number Coming or not ->{}",firstnameofcust);
	  mobilecomib.setMobilenumbers(firstnameofcust); return mobilecomib; }
	 
}
