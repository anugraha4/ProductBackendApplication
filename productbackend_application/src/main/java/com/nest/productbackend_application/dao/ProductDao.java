package com.nest.productbackend_application.dao;

import com.nest.productbackend_application.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product,Integer> {
}
