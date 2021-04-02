package model;

public class Customer 
{
	private int customerID;
	private String firstName;
	private double credit;
	
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
	public double getCredit() 
	{
		return credit;
	}
//	setter------------------------------------------
	public void setCredit(double credit) 
	{
		this.credit = credit;
	}
	public void setCustomerID(int customerID) 
	{
		this.customerID = customerID;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	
	
	
}
