package service;

import entities.Produit;

import java.util.List;

public interface ProduitServ {
    void insert(Produit p);
    List<Produit> getAll();
    void update(Produit p);
    void delete(Produit p);
}
