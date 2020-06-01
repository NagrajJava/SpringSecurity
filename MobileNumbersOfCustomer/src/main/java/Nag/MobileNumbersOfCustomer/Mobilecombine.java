package Nag.MobileNumbersOfCustomer;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Mobilecombine 
{
  private List<MobileNumbers> mobilenumbers;

public List<MobileNumbers> getMobilenumbers() {
	return mobilenumbers;
}

public void setMobilenumbers(List<MobileNumbers> mobilenumbers) {
	this.mobilenumbers = mobilenumbers;
}
  
  
  
}
