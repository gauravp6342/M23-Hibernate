package com.cg.service;

import com.cg.dao.EmployeeDao;
import com.cg.dao.EmployeeDaoImpl;
import com.cg.entities.Employee;

public class EmployeeServiceImpl implements EmployeeService
{
	private EmployeeDao dao ;
	 public EmployeeServiceImpl(){
		 super();
		 dao = new EmployeeDaoImpl();
		 }
	@Override
	public Employee addEmployee(Employee employee) {
		dao.beginTransaction();
		dao.addEmployee(employee);
		dao.commitTransaction();
		return employee;
	}
	@Override
	public Employee updateEmployee(Employee employee) {
		dao.beginTransaction();
		dao.updateEmployee(employee);
		dao.commitTransaction();
		return employee;
	}
	@Override
	public Employee searchEmployee(long Emp_id) {
		Employee employee = dao.searchEmployee(Emp_id);
		return employee;
	}
	@Override
	public boolean deleteEmployee(long Emp_id) {
		dao.beginTransaction();
		boolean res= dao.deleteEmployee(Emp_id);
		dao.commitTransaction();
		return res;
	}
}