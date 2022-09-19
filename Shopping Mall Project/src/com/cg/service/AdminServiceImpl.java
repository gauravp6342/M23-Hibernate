package com.cg.service;

import com.cg.dao.AdminDao;
import com.cg.dao.AdminDaoImpl;
import com.cg.entities.Admin;

public class AdminServiceImpl implements AdminService
{
	 private AdminDao dao ;
	 public AdminServiceImpl(){
		 super();
		 dao = new AdminDaoImpl();
		 
	 }
	@Override
	public boolean approveNewShop(Admin admin) {
		dao.beginTransaction();
		dao.addAdmin(admin);
		dao.commitTransaction();
		return false;
	}
}