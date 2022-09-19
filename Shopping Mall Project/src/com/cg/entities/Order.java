package com.cg.entities;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="OrderDetails")
public class Order 
{
	@Id
	private int Order_id;
	LocalDateTime ldt;
	private float total;
	private String paymentMode;
	
	@ManyToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name="Cust_Id")
	//private Customer customer;
	
	//getters & setters method
	public int getOrder_id() {
		return Order_id;
	}
	public void setOrder_id(int order_id) {
		Order_id = order_id;
	}
	public LocalDateTime getLdt() {
		return ldt;
	}
	public void setLdt(LocalDateTime ldt) {
		this.ldt = ldt;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
/*	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}		*/
}
