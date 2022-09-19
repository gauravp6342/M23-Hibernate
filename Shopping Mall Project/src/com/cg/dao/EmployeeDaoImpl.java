package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao
{
   private EntityManager em ;
    
    public EmployeeDaoImpl() {
    	super();
    	em=JPAUtil.getEntityManager();
    }
	@Override
	public Employee addEmployee(Employee employee) {
		em.persist(employee);
		return employee;
	}
	@Override
	public Employee updateEmployee(Employee employee) {
		em.merge(employee);
		return employee;
	}
	@Override
	public Employee searchEmployee(long id) {
		Employee employee = em.find(Employee.class, id);
		return employee;
	}
	@Override
	public boolean deleteEmployee(long id) {
		em.remove(id);
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