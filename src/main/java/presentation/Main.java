package presentation;

import entities.Produit;
import service.ProduitService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProduitService service = new ProduitService();
        service.insert(new Produit(11,"Proust","cookie", 2.36F));
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("cmdDB_persUnit");
//        EntityManager em = emf.createEntityManager();
//
//        List<Produit> list = em.createQuery("SELECT p from Produit p", Produit.class).getResultList();
//        list.forEach(System.out::println);
//        em.close();
//        emf.close();
    }
}
