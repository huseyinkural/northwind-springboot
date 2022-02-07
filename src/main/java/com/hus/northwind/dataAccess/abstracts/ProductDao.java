package com.hus.northwind.dataAccess.abstracts;

import com.hus.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao  extends JpaRepository<Product,Integer> {
}
