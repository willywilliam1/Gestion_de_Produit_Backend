package com.punisher.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.punisher.produits.entities.Categorie;
import com.punisher.produits.entities.Produit;
import com.punisher.produits.repos.ProduitRepository;

@SpringBootTest
class ProduitsApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;
	
	@Test
	public void testCreateProduit() {
		Produit prod = new Produit("PS4",2200.500,new Date());
		produitRepository.save(prod);
	}
	
	@Test
	public void testFindProduit(){
		
		Produit p = produitRepository.findById(1L).get(); 
		System.out.println(p);
	}
	
	@Test
	public void testUpdateProduit(){
		Produit p = produitRepository.findById(1L).get();
		p.setPrixProduit(1000.0); 
		produitRepository.save(p);
		System.out.println(p);
	}
	
	@Test
	public void testDeleteProduit(){
		produitRepository.deleteById(1L);;
	}
	
	@Test
	public void testListerTousProduits(){
		List<Produit> prods = produitRepository.findAll();
		
		for (Produit p : prods){
			System.out.println(p);
		}
	}
	
	@Test
	public void testFindProduitByNom(){
		List<Produit> prods = produitRepository.findByNomProduit("PS4"); 
		for (Produit p : prods){
			System.out.println(p);
		}
	}
	
	@Test
	public void testFindProduitByNomPrix(){
		List<Produit> prods = produitRepository.findByNomPrix("PC Dell",  1000.0); 
		for (Produit p : prods){
			System.out.println(p);
		}
	}
	
	@Test
	public void testfindByCategorie(){
		Categorie cat = new Categorie();
		
		cat.setIdCat(3L);
		
		List<Produit> prods = produitRepository.findByCategorie(cat);
		
		for (Produit p : prods){
			System.out.println(p);
		}
	}
	
	@Test
	public void testfindByCategorieIdCat(){
		
		List<Produit> prods = produitRepository.findByCategorieIdCat(3L);
		
		for (Produit p : prods){
			System.out.println(p);
		}
	}

}
