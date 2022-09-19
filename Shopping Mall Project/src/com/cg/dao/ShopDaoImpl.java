package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Shop;

public class ShopDaoImpl implements ShopDao
{
	   private EntityManager em ;
	    
	    public ShopDaoImpl() {
	    	super();
	    	em=JPAUtil.getEntityManager();
	    }
		@Override
		public Shop addShop(Shop shop) {
			em.persist(shop);
			return shop;
		}
		@Override
		public Shop updateShop(Shop shop) {
			em.merge(shop);
			return shop;
		}
		@Override
		public Shop searchShopById(long Shop_Id) {
			Shop shop =em.find(Shop.class, Shop_Id);
			return shop;
		}
		@Override
		public boolean deleteShop(long Shop_Id) {
			em.remove(Shop_Id);
			return false;
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