package br.com.nicolasteofilo.marketplace_api.controller;

import br.com.nicolasteofilo.marketplace_api.model.Product;
import br.com.nicolasteofilo.marketplace_api.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
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

   @GetMapping
   public List<Product> getAll() {
        return productRepository.findAll();
   }

   @GetMapping("{id}")
   public Product getById(@PathVariable String id) {
       Optional<Product> product = productRepository.findById(id);
       return product.orElse(null); // if Optional has value, return this value, else return the argument passed on method
   }
}
