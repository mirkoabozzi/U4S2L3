package Catalogo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        Product product1 = new Product("iphone", "smartphone", 1000.00);
        Product product2 = new Product("libro1", "books", 12.00);
        Product product3 = new Product("libro2", "books", 10.00);
        Product product4 = new Product("pannolini", "baby", 5.00);
        Product product5 = new Product("latte", "baby", 2.00);
        Product product6 = new Product("deodorante", "boys", 5.00);
        Product product7 = new Product("dopobarba", "boys", 3.00);

        Customer cliente1 = new Customer("mirko", 1);

        List<Product> lista1 = new ArrayList<>();
        lista1.add(product2);
        lista1.add(product3);

        Order order1 = new Order("confermato", today, lista1, cliente1);


    }
}