package com.hus.northwind.business.abstracts;

import com.hus.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
