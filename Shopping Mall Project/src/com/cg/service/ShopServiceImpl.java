package com.cg.service;

import com.cg.dao.ShopDao;
import com.cg.dao.ShopDaoImpl;
import com.cg.entities.Shop;

public class ShopServiceImpl implements ShopService
{
	private ShopDao dao ;
	 public ShopServiceImpl(){
		 super();
		 dao = new ShopDaoImpl();
}
	@Override
	public Shop addShop(Shop shop) {
		dao.beginTransaction();
		dao.addShop(shop);
		dao.commitTransaction();
		return shop;
	}
	@Override
	public Shop updateShop(Shop shop) {
		dao.beginTransaction();
		dao.updateShop(shop);
		dao.commitTransaction();
		return shop;
	}
	@Override
	public Shop searchShopById(long Shop_Id) {
		Shop shop = dao.searchShopById(Shop_Id);
		return shop;
	}
	@Override
	public boolean deleteShop(long Shop_Id) {
		dao.beginTransaction();
		boolean res= dao.deleteShop(Shop_Id);
		dao.commitTransaction();
		return res;
	}
}