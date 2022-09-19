package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Order;

public class OrderDaoImpl implements OrderDao
{
	private EntityManager em ;
    
    public OrderDaoImpl() {
    	super();
    	em=JPAUtil.getEntityManager();
    }
	@Override
	public Order addOrder(Order order) {
		em.persist(order);
		return order;
	}
	@Override
	public Order updateOrder(Order order) {
		em.merge(order);
		return order;
	}
	@Override
	public Order searchOrder(long id) {
		Order order=em.find(Order.class,id);
		return order;
	}
	@Override
	public Order deleteOrder(long id) {
		em.remove(id);
		return null;
	}
	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
	}
	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
	}
}