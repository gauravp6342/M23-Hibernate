package com.cg.dao;

import com.cg.entities.Order;

public interface OrderDao 
{
public abstract Order addOrder(Order order);
public abstract Order updateOrder(Order order);
public abstract Order searchOrder(long id);
public abstract Order deleteOrder(long id);

public abstract void commitTransaction();
public abstract void beginTransaction();
}
