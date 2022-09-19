package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.User;

public class UserDaoImpl  implements UserDao
{
    private EntityManager em ;
    
    public UserDaoImpl() {
    	super();
    	em=JPAUtil.getEntityManager();
    }
	@Override
	public User addNewUser(User user) {
		em.persist(user);
		return user;
	}
	@Override
	public User updateUser(User user) {
		em.merge(user);
		return user;
	}
	@Override
	public User deleteUser(long User_Id) {
		em.remove(User_Id);
		return null;
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