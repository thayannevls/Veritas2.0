package persistence;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import person.Person;

public class PersistencePerson {
	EntityManagerFactory emf;
	EntityManager em;
	
	public PersistencePerson(){
		emf = Persistence.createEntityManagerFactory("eddie");
		em = emf.createEntityManager();
	}
		
	public void savePerson(Person p){
		em.getTransaction().begin();
		em.merge(p); // ou em.persistence()
		em.getTransaction().commit();
		emf.close();
	}
}
