import java.util.HashMap;

public class Inventory {
    private HashMap<String, Product> products;

    public Inventory() {
        this.products = new HashMap<>();
    }

    public void addProduct(Product product) {
        if (products.containsKey(product.getProductId())) {
            System.out.println("Product already added!");
            return;
        }
        products.put(product.getProductId(), product);
        System.out.println("Product added");
    }

    public void updateProduct(Product product) {
        if (!products.containsKey(product.getProductId())) {
            System.out.println("Product does not exists!");
            return;
        }
        products.put(product.getProductId(), product);
        System.out.println("Product info. updated");
    }

    public void deleteProduct(String productId) {
        Product product = products.remove(productId);
        if (product == null) {
            System.out.println("Product with product id " + productId + " does not exist!");
            return;
        }
        System.out.println("Product " + product + " deleted");
    }

    public Product getProduct(String productId) {
        if (!products.containsKey(productId)) {
            return null;
        }
        return products.get(productId);
    }

    @Override
    public String toString() {
        return "Number of products available: " + products.size();
    }
}
