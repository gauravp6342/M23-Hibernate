package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Shop")
public class Shop 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Shop_Id;
    private String shopCategory;
	private String shopname;
    private String shopstatus;
    private String leaseStatus;
    
    //Getter And Setter
	public int getShop_Id() {
		return Shop_Id;
	}
	public void setShop_Id(int shop_Id) {
		Shop_Id = shop_Id;
	}
	public String getShopCategory() {
		return shopCategory;
	}
	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getShopstatus() {
		return shopstatus;
	}
	public void setShopstatus(String shopstatus) {
		this.shopstatus = shopstatus;
	}
	public String getLeaseStatus() {
		return leaseStatus;
	}
	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}
}