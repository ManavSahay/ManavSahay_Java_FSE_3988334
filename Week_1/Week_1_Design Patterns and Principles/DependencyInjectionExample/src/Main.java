public class Main {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        CustomerService customerService = new CustomerService(customerRepository);

        Customer customer = customerService.getCustomerById("1");
        System.out.println(customer);

        Customer anotherCustomer = customerService.getCustomerById("2");
        System.out.println(anotherCustomer);
    }
}
