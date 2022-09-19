package com.cg.service;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import com.cg.dao.CustomerDao;
import com.cg.dao.CustomerDaoImpl;

import com.cg.entities.Customer;

public class CustomerServiceImpl implements CustomerService 
{
	private CustomerDao dao ;
	 public CustomerServiceImpl(){
		 super();
		 dao = new CustomerDaoImpl();
		 }
	@Override
	public Customer searchItem(String itemName) {
		dao.beginTransaction();
		dao.commitTransaction();
		return null;
	}
	@Override
	public Customer orderItem(Item item) {
		dao.beginTransaction();
		dao.commitTransaction();
		return null;
	}
	@Override
	public Customer searchMall(long id) {
		dao.beginTransaction();
		dao.commitTransaction();
		return null;
	}
	@Override
	public Customer cancelOrder(long Order_Id) {
		dao.beginTransaction();
		dao.commitTransaction();
		return null;
	}
	@Override
	public Customer updateCustomer(Customer customer) {
		dao.beginTransaction();
		dao.updateCustomer(customer);
		dao.commitTransaction();
	return customer;
	}
}