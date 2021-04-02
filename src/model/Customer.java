package model;

public class Customer 
{
	private int customerID;
	private String firstName;
	
	public Customer()
	{
		setCustomerID (customerID);
		setFirstName(firstName);
	}
//	getter------------------------------------------
	public int getCustomerID() 
	{
		return customerID;
	}
	public String getFirstName() 
	{
		return firstName;
	}
//	setter------------------------------------------
	public void setCustomerID(int customerID) 
	{
		this.customerID = customerID;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	
}
