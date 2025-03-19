package EsercizioS14L3;

import java.time.LocalDate;
import java.util.List;

public class Esercizio2 {
    public static void main(String[] args) {
        Order order1 = new Order(2L, "Inviata", LocalDate.of(2023, 6, 10), LocalDate.of(2023, 6, 15), List.of(new Product(1L, "Libro1", "Books", 10.0)), "Customer1");
        Order order2 = new Order(3L, "Consegnata", LocalDate.of(2023, 6, 15), LocalDate.of(2023, 6, 20), List.of(new Product(2L, "Libro2", "Baby", 130.0)), "Customer2");
        Order order3 = new Order(4L, "Consegnata", LocalDate.of(2023, 6, 20), LocalDate.of(2023, 6, 25), List.of(new Product(3L, "Libro3", "Books", 130.0)), "Customer3");
        Order order4 = new Order(5L, "Consegnata", LocalDate.of(2023, 6, 25), LocalDate.of(2023, 6, 30), List.of(new Product(4L, "Libro4", "Baby", 140.0)), "Customer4");
        List<Order> orders = List.of(order1, order2, order3, order4);

        System.out.println("Lista di ordine con prodotti che appartengono alla categoria Baby:");
        orders.stream().filter(order -> order.getProducts().stream().anyMatch(product -> product.getCategory().equals("Baby"))).forEach(order -> System.out.println(order.getId() + " - " + order.getCustomer()));
    }
}