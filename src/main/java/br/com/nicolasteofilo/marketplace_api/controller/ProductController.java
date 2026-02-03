package br.com.nicolasteofilo.marketplace_api.controller;

import br.com.nicolasteofilo.marketplace_api.model.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products") // base url for controller
public class ProductController {
    @PostMapping
    public Product save(@RequestBody Product product) {
        return product;
   }
}
