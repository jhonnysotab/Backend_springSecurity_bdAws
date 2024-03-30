package com.jhonnysota.curso.springboot.app.springbootcrud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jhonnysota.curso.springboot.app.springbootcrud.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
    boolean existsBySku(String sku);
}
