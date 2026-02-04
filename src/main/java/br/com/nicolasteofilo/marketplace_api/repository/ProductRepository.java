package br.com.nicolasteofilo.marketplace_api.repository;

import br.com.nicolasteofilo.marketplace_api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {

}
