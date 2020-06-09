package br.com.mnr.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private EntityManagerFactory factory;
	
	private static JPAUtil instance;
	
	private JPAUtil(){
		this.factory = Persistence.createEntityManagerFactory("mnrtcc");
	}
	
	public static synchronized JPAUtil getInstance(){
		if(instance == null){
			instance = new JPAUtil();
		}
		return instance;
	}
	
	public EntityManager getEntityManager(){
		return factory.createEntityManager();
	}
}
