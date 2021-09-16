package service;

import dao.EntityManagerFacSingleton;
import entities.Produit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ProduitService implements ProduitServ{
    @Override
    public void insert(Produit p) {
        EntityManager em = EntityManagerFacSingleton.getInstance().createEntityManager();

        em.getTransaction().begin();
        em.persist(new Produit(p.getId(),p.getMarque(),p.getNom(),p.getPrix()));
        em.getTransaction().commit();

        em.close();
        EntityManagerFacSingleton.close();
    }

    @Override
    public List<Produit> getAll() {
        return null;
    }

    @Override
    public void update(Produit p) {

    }

    @Override
    public void delete(Produit p) {
        EntityManager em = EntityManagerFacSingleton.getInstance().createEntityManager();

        em.remove( em.find(Produit.class, p.getId()));

        em.close();
        EntityManagerFacSingleton.close();
    }
}
