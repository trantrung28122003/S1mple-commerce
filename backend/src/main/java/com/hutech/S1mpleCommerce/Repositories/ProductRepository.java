package com.hutech.S1mpleCommerce.Repositories;

import com.hutech.S1mpleCommerce.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}