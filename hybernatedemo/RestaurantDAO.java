package com.xworkz.hybernatedemo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class RestaurantDAO {
     
	
		
		public void saveRestaurent(Restaurantentity entity) {
			 EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA");
		      
		      EntityManager entitymanager = emfactory.createEntityManager();
		      entitymanager.getTransaction( ).begin( );
		      
		      entitymanager.persist( entity );
		      entitymanager.getTransaction( ).commit( );

		      entitymanager.close( );
		      emfactory.close( );
		}

	}
	

