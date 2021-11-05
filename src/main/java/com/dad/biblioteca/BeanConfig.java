package com.dad.biblioteca;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	
	
	public SessionFactory getSessionFactory() {
		
			if(entityManagerFactory.unwrap(SessionFactory.class) == null ) {
				
				throw new NullPointerException("factory es not a hibernate factory");
			}
		
		
		return entityManagerFactory.unwrap(SessionFactory.class);
		
	}

}
