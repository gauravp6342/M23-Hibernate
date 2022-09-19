package com.cg.service;

import com.cg.dao.OrderDao;
import com.cg.dao.OrderDaoImpl;
import com.cg.entities.Order;

public class OrderServiceImpl implements OrderService 
{
	private OrderDao dao ;
	 public OrderServiceImpl(){
		 super();
		 dao = new OrderDaoImpl();
		 }
	@Override
	public Order addOrder(Order order) {
		dao.beginTransaction();
		dao.addOrder(order);
		dao.commitTransaction();
		return order;
	}
	@Override
	public Order updateOrder(Order order) {
		dao.beginTransaction();
		dao.updateOrder(order);
		dao.commitTransaction();
		return order;
	}
	@Override
	public Order searchOrder(long Order_id) {
		Order order= dao.searchOrder(Order_id);
		return order;
	}
	@Override
	public Order cancelMall(long id) {
		dao.beginTransaction();
		dao.commitTransaction();
		return null;
	}	
}