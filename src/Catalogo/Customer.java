package Catalogo;

import java.util.Random;

public class Customer {
    private long id;
    private String name;
    private int tier;

    public Customer(String name, int tier) {
        Random random = new Random();
        this.id = random.nextInt(1000, 2000);
        this.name = name;
        this.tier = tier;
    }
}
