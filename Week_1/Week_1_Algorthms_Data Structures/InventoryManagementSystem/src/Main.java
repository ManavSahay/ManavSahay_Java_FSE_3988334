public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("P101", "Laptop", 7, 60000);
        Product p2 = new Product("P102", "Monitor", 5, 23000);

        Inventory inv = new Inventory();

        inv.addProduct(p1);
        inv.addProduct(p2);

        inv.updateProduct(new Product("P101", "Laptop", 10, 57000));

        Product p = inv.getProduct("P101");

        System.out.println(p != null ? p : "Product does not exist");

        inv.deleteProduct("P102");
    }
}
