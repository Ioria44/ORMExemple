package ua.myproject.orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = entityManagerFactory.createEntityManager();

		em.getTransaction().begin();
		em.getTransaction().commit();

		em.close();
		entityManagerFactory.close();

	}
}
