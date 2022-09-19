package com.cg.service;

import com.cg.entities.Order;

public interface OrderService 
{
	public abstract Order addOrder(Order order);
	public abstract Order updateOrder(Order order);
	public abstract Order searchOrder(long Order_id);
	public abstract Order cancelMall(long id);
}
