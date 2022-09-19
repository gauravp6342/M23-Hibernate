package com.capgemini.bi.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToOneBiDirectional
{
	public static void main(String[] args) 
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Department d=new Department();
		d.setId(56203);
		d.setDeptName("Marketing");
		
		Employee e=new Employee();
		e.setEmpId(519);
		e.setEname("Pratiksha");
		e.setSalary(56000.40f);
		
		Employee e1=new Employee();
		e1.setEmpId(520);
		e1.setEname("Gaurav");
		e1.setSalary(78000.90f);
	
		e.setDept(d);
		e1.setDept(d);
		
		em.persist(e);
		em.persist(e1);
		
		System.out.println("Rows is inserted");
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}
