package persistence;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.Session;

import person.Person;
//CRUD OF USER CLASS
//ONLY THE MANAGER CAN CRUD USERS
public class PersistencePerson {
	
	protected EntityManager em; 
    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("eddie");
        if (em == null) {
            em = factory.createEntityManager();
        }
        return em;
    }
    
    public PersistencePerson() {
        this.em = getEntityManager();
    }
    
    //INSERT
    
    public void persist(Person p) {
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
        }
    }
    
    //SELECT
    
    public Person selectById(final int id) {
        return em.find(Person.class, id);
    }
    
    //UPDATE
    
    public void merge(final int id) {
        Scanner l = new Scanner(System.in);
    	try{
            em.getTransaction().begin();
            Person p = selectById(id);
            //---------------------------------------------------------------
            //Temporary update 
            System.out.println("New name: ");
            p.setName(l.nextLine());
            System.out.println("New password: ");
            p.setPasswd(l.nextLine());
            //---------------------------------------------------------------
            em.merge(p);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
        }
    }
    
    //DELETE
    
    public void removeById(final int id) {
        try {
            Person p = selectById(id);
            em.remove(p);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
 
   
 
    
   
}
