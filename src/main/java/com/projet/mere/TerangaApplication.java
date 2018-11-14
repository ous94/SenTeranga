package com.projet.mere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.projet.mere.Entities.Produit;
import com.projet.mere.repository.ProduitRepository;

@SpringBootApplication
public class TerangaApplication {

	public static void main(String[] args) {
	ApplicationContext ctx =	SpringApplication.run(TerangaApplication.class, args);
	ProduitRepository produitRepository =ctx.getBean(ProduitRepository.class);
	produitRepository.save(new Produit("savon", 200000, 12));
	produitRepository.save(new Produit("boison", 12200000, 2));
	produitRepository.save(new Produit("avion", 200000, 12));
	produitRepository.save(new Produit("taxi", 200000, 12));
	produitRepository.save(new Produit("camion", 1300000, 6));
	produitRepository.findAll().forEach(p ->System.out.println(p.getDesignation()));


	}
}
