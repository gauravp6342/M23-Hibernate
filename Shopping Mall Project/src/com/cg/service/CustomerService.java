package com.cg.service;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import com.cg.entities.Customer;

public interface CustomerService 
{
	public abstract Customer searchItem(String itemName);
	public abstract Customer orderItem(Item item);
	public abstract  Customer searchMall(long id);
	public abstract Customer cancelOrder(long Order_Id);
	public abstract Customer updateCustomer(Customer customer);
}
