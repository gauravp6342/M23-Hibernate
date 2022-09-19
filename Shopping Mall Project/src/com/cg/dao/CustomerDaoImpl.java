package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Customer;

public class CustomerDaoImpl implements CustomerDao
{
	 private EntityManager em ;
	    
	    public CustomerDaoImpl() {
	    	super();
	    	em=JPAUtil.getEntityManager();
	    }
	@Override
	public Customer addCustomer(Customer customer) {
		em.persist(customer);
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		em.merge(customer);
		return customer;
	}

	@Override
	public Customer searchCustomer(long id) {
		Customer customer=em.find(Customer.class,id);
		return customer;
	}

	@Override
	public Customer deleteCustomer(long id) {
		em.remove(id);
		return null;
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
	}
}
