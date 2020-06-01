package Nag.CustomerService;

import java.util.List;

public class CustomerInfo 
{
   private List<Customer> customer;
     
   
public CustomerInfo() {
	super();
	// TODO Auto-generated constructor stub
}

public List<Customer> getCustomer() {
	return customer;
}

public void setCustomer(List<Customer> customer) {
	this.customer = customer;
}

@Override
public String toString() {
	return "CustomerInfo [customer=" + customer + "]";
}
   
   
   
}
