package EsercizioS14L3;

import java.util.List;

public class Esercizio1 {
    public static void main(String[] args) {
    Product product1 = new Product(1L, "Libro1", "Books", 10.0);
    Product product2 = new Product(2L, "Libro2", "Baby", 20.0);
    Product product3 = new Product(3L, "Libro3", "Books", 130.0);
    Product product4 = new Product(4L, "Libro4", "Baby", 140.0);
    List<Product> Product = List.of(product1, product2, product3, product4);
        System.out.println("Prodotti che appartengono alla categoria Books e che abbiano un prezzo superiore a 100: ");
        Product.stream().filter(products -> products.getCategory().equals("Books") && products.getPrice() > 100).forEach(product -> System.out.println(product.getName() + " - " + product.getPrice()));
    }
}
