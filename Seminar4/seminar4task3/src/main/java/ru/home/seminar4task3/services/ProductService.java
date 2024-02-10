package ru.home.seminar4task3.services;

import org.springframework.stereotype.Service;
import ru.home.seminar4task3.domain.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){products.add(product);}
    public List<Product> findAll(){return products;}

}
