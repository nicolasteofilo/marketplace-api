package br.com.nicolasteofilo.marketplace_api.controller;

import br.com.nicolasteofilo.marketplace_api.model.Product;
import br.com.nicolasteofilo.marketplace_api.repository.ProductRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("products") // base url for controller
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        String id = UUID.randomUUID().toString();
        product.setId(id);
        productRepository.save(product);
        return product;
   }
}
