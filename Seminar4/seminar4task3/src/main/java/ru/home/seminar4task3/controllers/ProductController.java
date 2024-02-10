package ru.home.seminar4task3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.home.seminar4task3.domain.Product;
import ru.home.seminar4task3.services.ProductService;

import java.util.List;

@Controller
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/products")
    public String viewProducts(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "products";
    }

    @PostMapping("/products")
    public String addProduct(Product product, Model model) {
        productService.addProduct(product);
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "products";
    }
}
