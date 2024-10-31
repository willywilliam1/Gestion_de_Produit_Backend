package com.punisher.produits.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomProd", types = {Produit.class})
public interface ProduitProject {
	public String getNomProduit();
}
