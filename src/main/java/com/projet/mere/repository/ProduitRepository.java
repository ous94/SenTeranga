package com.projet.mere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.mere.Entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
