package com.hutech.S1mpleCommerce.Controllers;

import com.hutech.S1mpleCommerce.Entities.Product;
import com.hutech.S1mpleCommerce.Services.ProductService;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost")
public class HomeController {
    private final ProductService _productService;
    public HomeController(ProductService productService) {
        _productService = productService;
    }
    @RequestMapping("/")
    public List<Product> home() {
        return _productService.GetAllProduct();
    }
}