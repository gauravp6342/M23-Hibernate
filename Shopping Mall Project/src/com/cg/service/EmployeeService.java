package com.cg.service;

import com.cg.entities.Employee;

public interface EmployeeService 
{
	public abstract Employee addEmployee(Employee employee);
	public abstract Employee updateEmployee(Employee employee);
	public abstract Employee searchEmployee(long Emp_id);
	public abstract boolean deleteEmployee(long Emp_id);
}