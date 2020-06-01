package Nag.MobileNumbersOfCustomer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="MobileNumbers")
public class MobileNumbers 
{
	
	@Id
    private Long mobileNumber;
	
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

	public MobileNumbers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MobileNumbers(Long mobileNumber) {
		super();
		this.mobileNumber = mobileNumber;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	


	
	
	
}
