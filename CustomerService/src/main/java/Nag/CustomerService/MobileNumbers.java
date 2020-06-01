package Nag.CustomerService;

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
	     
	

	public MobileNumbers(Long mobileNumber) {
		super();
		this.mobileNumber = mobileNumber;
		
	}


	



	public MobileNumbers() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}






	@Override
	public String toString() {
		return "MobileNumbers [mobileNumber=" + mobileNumber + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + "]";
	}


	
}
