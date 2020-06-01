package Nag.CustomerService;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.swing.text.DefaultEditorKit.CutAction;

@Entity
@Table(name = "CustomerDetails")
public class Customer
{
	
	
   private String firstName;
   private String middleName;
   private String lastName;
    @Id
    private int age;
  @ManyToOne
  private MobileNumbers mobilenumbers;
  
  @OneToOne
  private CustomerAddress customerAddress;
 
  public Customer() {
	super();
	// TODO Auto-generated constructor stub
}

public Customer(int age, 
		String firstName, 
		String middleName, 
		String lastName,
		Long mobid,
		String addresline,
		String state,
		String city,
		String Country,
		Long zipCode) {
	super();
	this.age = age;
	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
	this.mobilenumbers = new MobileNumbers(mobid);
	this.customerAddress = new CustomerAddress(addresline,city,state,Country,zipCode);
	/*
	 * this.customerAddress = new
	 * CustomerAddress(zipCode,customerAddress.getCity(),customerAddress.
	 * getAddressLine(), customerAddress.getState() ,
	 * customerAddress.getCountry(),"","","");
	 */
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

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

public MobileNumbers getMobilenumbers() {
	return mobilenumbers;
}

public void setMobilenumbers(MobileNumbers mobilenumbers) {
	this.mobilenumbers = mobilenumbers;
}

public CustomerAddress getCustomerAddress() {
	return customerAddress;
}

public void setCustomerAddress(CustomerAddress customerAddress) {
	this.customerAddress = customerAddress;
}

 
   
}
