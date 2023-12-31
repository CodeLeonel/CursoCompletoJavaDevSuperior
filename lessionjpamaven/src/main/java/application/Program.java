package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Person;

public class Program {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sample-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Person p = em.find(Person.class, 2);
		
		em.remove(p);
				
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		System.out.println("Ready!");
		
		
	}

}
