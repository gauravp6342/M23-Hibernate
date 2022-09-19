package com.cg.dao;

import com.cg.entities.Admin;

public interface AdminDao
{
	public abstract Admin addAdmin(Admin admin);
	public abstract Admin updateAdmin(Admin admin );
	public abstract Admin searchAdmin(long Admin_id);
	public boolean deleteAdmin(long Admin_id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}