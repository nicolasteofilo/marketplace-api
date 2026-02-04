package br.com.nicolasteofilo.marketplace_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity; // JPA ≥ Java Persistence API
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

// POJO -> Plain Old Java Object
@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "id")
    @Getter @Setter private String id;

    @Column(name = "name")
    @Getter @Setter private String name;

    @Column(name = "description")
    @Getter @Setter private String description;

    @Column(name = "priceInCents")
    @Getter @Setter private int priceInCents;

    @Override
    public String toString() {
        return "Product {" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + priceInCents +
                '}';
    }
}
