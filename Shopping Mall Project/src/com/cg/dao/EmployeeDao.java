package com.cg.dao;

import com.cg.entities.Employee;

public interface EmployeeDao 
{
	public abstract Employee addEmployee(Employee employee);
	public abstract Employee updateEmployee(Employee employee);
	public abstract Employee searchEmployee(long id);
	public boolean deleteEmployee(long id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}