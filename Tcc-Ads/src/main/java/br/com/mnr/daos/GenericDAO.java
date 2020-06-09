package br.com.mnr.daos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.mnr.util.JPAUtil;

public abstract class GenericDAO<T extends Serializable> {
	
	private Class<T> aClass;
	
	protected GenericDAO(Class<T> aClass){
		this.aClass = aClass;
	}
	
	protected EntityManager getEntityManager(){
		return JPAUtil.getInstance().getEntityManager();
	}
	
	public void save(T entity){
		EntityManager manager = getEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void update(T entity){
		EntityManager manager = getEntityManager();
		manager.getTransaction().begin();
		manager.merge(entity);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void delete(Long id){
		EntityManager manager = getEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.getReference(aClass, id));
		manager.getTransaction().commit();
		manager.close();
	}
	
	//FAZ UMA CONSULTA PELO ID
	public T findById(Long id){
		EntityManager manager = getEntityManager();
		manager.getTransaction().begin();
		
		T entity = (T) manager.find(aClass, id);

		manager.getTransaction().commit();
		manager.close();
		
		return entity;
	}
	
	//RETORNA TUDO EM UMA LIST DA CLASS QUE FOI PASSADA
	@SuppressWarnings("unchecked") //COLOCADA AQUI PRA TIRAR O ERRO POIS NAO TEM NADA NO DB... TIRAR DEPOIS
	public List<T> findAll(){
		EntityManager manager = getEntityManager();
		manager.getTransaction().begin();
		
		Query query = manager.createQuery("from " + aClass.getSimpleName());
		
		List<T> entities = query.getResultList();
		
		manager.getTransaction().commit();
		manager.close();
		
		return entities;
	}
}
