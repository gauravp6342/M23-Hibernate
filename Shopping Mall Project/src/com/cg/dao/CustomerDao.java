package com.cg.dao;

import com.cg.entities.Customer;

public interface CustomerDao 
{
	public abstract Customer addCustomer(Customer customer);
	public abstract Customer updateCustomer(Customer customer);
	public abstract Customer searchCustomer(long id);
	public abstract Customer deleteCustomer(long id);
	
	 public abstract void beginTransaction();
	 public abstract void commitTransaction();
}