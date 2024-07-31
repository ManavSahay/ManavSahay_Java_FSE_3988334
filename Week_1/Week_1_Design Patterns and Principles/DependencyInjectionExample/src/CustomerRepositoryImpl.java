import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, Customer> customers = new HashMap<>();

    public CustomerRepositoryImpl() {
        customers.put("1", new Customer("1", "Raj"));
        customers.put("2", new Customer("2", "Aman"));
    }

    @Override
    public Customer findCustomerById(String id) {
        return customers.get(id);
    }
}
