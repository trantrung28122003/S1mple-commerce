package com.hutech.S1mpleCommerce.Services;

import com.hutech.S1mpleCommerce.Entities.Product;
import com.hutech.S1mpleCommerce.Repositories.ProductRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
    private final ProductRepository _productRepository;

    public ProductService(ProductRepository productRepository) {
        this._productRepository = productRepository;
    }
    @Override
    public List<Product> GetAllProduct() {
        return _productRepository.findAll();
    }
}
