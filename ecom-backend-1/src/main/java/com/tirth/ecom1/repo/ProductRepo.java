package com.tirth.ecom1.repo;

import com.tirth.ecom1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface ProductRepo extends JpaRepository<Product,Integer> {

}
