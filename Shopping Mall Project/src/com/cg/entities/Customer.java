package com.cg.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer 
{
	@Id
	private int Cust_id;
	private String Cust_name;
	private String phone;
	private String email;
	
	@OneToMany(cascade=CascadeType.ALL)	
	
	//getters & setters method
	public int getCust_id() {
		return Cust_id;
	}
	public void setCust_id(int cust_id) {
		Cust_id = cust_id;
	}
	public String getCust_name() {
		return Cust_name;
	}
	public void setCust_name(String cust_name) {
		Cust_name = cust_name;
	}
	public String Phone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}