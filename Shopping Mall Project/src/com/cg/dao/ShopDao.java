package com.cg.dao;

import com.cg.entities.Shop;

public interface ShopDao
{
	public abstract Shop addShop(Shop shop);
	public abstract Shop updateShop(Shop shop);
	public abstract Shop searchShopById(long Shop_Id);
	public boolean deleteShop(long Shop_Id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
