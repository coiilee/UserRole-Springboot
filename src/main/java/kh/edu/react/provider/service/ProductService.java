package kh.edu.react.provider.service;

import kh.edu.react.provider.dto.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProducts();

    List<Product> searchProducts(String keyword);

    Product findProductById(int id);

    void saveProduct(Product product);
}
