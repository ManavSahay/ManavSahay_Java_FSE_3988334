import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static Product linearSearch(Product[] products, String target) {
        for (Product product : products) {
            if (product.getProductId().equals(target)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String target) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = products[mid].getProductId().compareTo(target);

            if (cmp == 0) {
                return products[mid];
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];

        String[] productID = {"101", "102", "103", "104", "105"};
        String[] productName = {"Laptop", "Monitor", "Tablet", "Smart Phone", "Earphones"};
        String[] category = {"PC", "PC", "Mobile", "Mobile", "Accessory"};

        for (int i = 0; i < products.length; i++) {
            products[i] = new Product(productID[i], productName[i], category[i]);
        }

        Product p = linearSearch(products, "103");
        System.out.println(p != null ? "Product found " + p : "Product not found " + p);

        Arrays.sort(products, Comparator.comparing(Product::getProductId));

        p = binarySearch(products, "103");
        System.out.println(p != null ? "Product found " + p : "Product not found " + p);
    }
}