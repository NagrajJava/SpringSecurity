package Nag.AddressOfCustomer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CustomerAddress 
{
	@Id
	 private Long zipCode;
	private String city;
    private String addressLine;
   private String state;
   private String country;
   private String firstName;
   private String middleName;
   private String lastName;
     
   
   


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getMiddleName() {
	return middleName;
}


public void setMiddleName(String middleName) {
	this.middleName = middleName;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
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


public CustomerAddress() {
	super();
	// TODO Auto-generated constructor stub
}
   






}
