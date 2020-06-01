package Nag.CustomerService;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CustomerAddress 
{
	 private String addressLine;
   private String city;
     private String state;
   private String country;
   @Id
   private Long zipCode;


public CustomerAddress() {
	super();
	// TODO Auto-generated constructor stub
}
  
   
   
   public CustomerAddress(String addressLine, String city,String state,String country,Long zipCode) {
	super();
	this.zipCode = zipCode;
	this.city = city;
	this.addressLine = addressLine;
	this.state = state;
	this.country = country;
	
   }


public String getAddressLine() {
	return addressLine;
}


public void setAddressLine(String addressLine) {
	this.addressLine = addressLine;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public String getState() {
	return state;
}


public void setState(String state) {
	this.state = state;
}


public String getCountry() {
	return country;
}


public void setCountry(String country) {
	this.country = country;
}


public Long getZipCode() {
	return zipCode;
}


public void setZipCode(Long zipCode) {
	this.zipCode = zipCode;
}



@Override
public String toString() {
	return "CustomerAddress [addressLine=" + addressLine + ", city=" + city + ", state=" + state + ", country="
			+ country + ", zipCode=" + zipCode + "]";
}

 






}
