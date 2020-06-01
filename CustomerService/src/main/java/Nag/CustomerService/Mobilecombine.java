package Nag.CustomerService;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Mobilecombine 
{
  private List<MobileNumbers> mobilenumbers;
  private List<CustomerAddress> customerAddress;
  
  
  
public List<CustomerAddress> getCustomerAddress() {
	return customerAddress;
}

public void setCustomerAddress(List<CustomerAddress> customerAddress) {
	this.customerAddress = customerAddress;
}

public List<MobileNumbers> getMobilenumbers() {
	return mobilenumbers;
}

public void setMobilenumbers(List<MobileNumbers> mobilenumbers) {
	this.mobilenumbers = mobilenumbers;
}

@Override
public String toString() {
	return "Mobilecombine [mobilenumbers=" + mobilenumbers + ", customerAddress=" + customerAddress + "]";
}
  
  
  
}
