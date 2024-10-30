package com.punisher.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.punisher.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
