package persistence;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import product.Product;
//CRUD OF PRODUCT
public class PersistenceProduct {
	
	protected EntityManager em; 
    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("eddie");
        if (em == null) {
            em = factory.createEntityManager();
        }
        return em;
    }
    
    public PersistenceProduct() {
        this.em = getEntityManager();
    }
    
    //INSERT
    
    public void persist(Product p) {
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
    
    public Product selectById(final int id) {
        return em.find(Product.class, id);
    }
    
    //UPDATE
    
    public void merge(final int id) {
        @SuppressWarnings("resource")
		Scanner l = new Scanner(System.in);
    	try{
            em.getTransaction().begin();
            Product p = selectById(id);
            //---------------------------------------------------------------
            //Temporary update 
            System.out.println("New name: ");
            p.setName(l.nextLine());
            System.out.println("New description: ");
            p.setDescription(l.nextLine());
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
        	em.getTransaction().begin();
            Product p = selectById(id);
            em.remove(p);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
   
 
    
   
}
