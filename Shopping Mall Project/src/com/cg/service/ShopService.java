package com.cg.service;

import com.cg.entities.Shop;

public interface ShopService 
{
	public abstract Shop addShop(Shop shop);
	public abstract Shop updateShop(Shop shop);
	public abstract Shop searchShopById(long Shop_Id);
	public abstract boolean deleteShop(long Shop_Id);	
}