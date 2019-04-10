package com.fis.pairconnect.repository;

import com.fis.pairconnect.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
