package br.com.nicolasteofilo.marketplace_api.model;

// POJO -> Plain Old Java Object
public class Product {
    private String id;
    private String name;
    private String description;
    private double priceInCents;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPriceInCents() {
        return priceInCents;
    }

    public void setPriceInCents(double priceInCents) {
        this.priceInCents = priceInCents;
    }

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
