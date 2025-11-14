import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class six {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200.00));
        products.add(new Product("Keyboard", 75.00));
        products.add(new Product("Mouse", 30.00));
        products.add(new Product("Monitor", 300.00));
        products.add(new Product("Headphones", 150.00));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the price threshold: ");
        double priceThreshold = scanner.nextDouble();

        long count = products.stream()
                .filter(p -> p.getPrice() > priceThreshold)
                .count();

        System.out.println("Total number of expensive products: " + count);
        scanner.close();
    }
}