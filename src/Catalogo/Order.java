package Catalogo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {
    private long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> products = new ArrayList<>();
    private Customer customer;

    public Order(String status, LocalDate orderDate, List<Product> products, Customer customer) {
        Random random = new Random();
        this.id = random.nextInt(1000, 2000);
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = LocalDate.now();
        this.products = products;
        this.customer = customer;
    }
}
