package com.capgemini.uni.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//program on one to one unidirectional
public class OneToOneUniDirection 
{
	public static void main(String[] args)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory(null);
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Student s=new Student();
		s.setRollno(206);
		s.setName("Ajay");
		s.setPercentage(90);
		
		Address a=new Address();
		a.setStreetno(6);
		a.setArea("Hadapsar");
		a.setCity("Pune");
		a.setState("Maharashtra");
		
		s.setAddress(a);
		
		em.persist(s);
		
		System.out.println("Rows is inserted");
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}
