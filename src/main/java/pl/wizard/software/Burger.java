package pl.wizard.software;

import java.util.ArrayList;
import java.util.List;

public class Burger {

    private final String name;
    private final List<String> products;
    private final double price;

    public Burger(String name, double price) {
        this.name = name;
        this.products = new ArrayList<>();
        this.price = price;
    }

    public void addProduct(String aProduct){
        products.add(aProduct);
    }

    public String getName() {
        return name;
    }

    public String getProductsAsString() {
        StringBuilder sb = new StringBuilder();
        products.stream().forEach(product -> {
            sb.append(product);
            sb.append(", ");
        });
        return sb.toString().substring(0, sb.toString().length() - 2);
    }

    public double getPrice() {
        return price;
    }
}
