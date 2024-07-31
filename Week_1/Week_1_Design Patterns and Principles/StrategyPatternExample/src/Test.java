public class Test {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567890123456", "Raja", "555", "12/29");
        context.setPaymentStrategy(creditCardPayment);
        context.pay(250.00);

        PaymentStrategy payPalPayment = new PayPalPayment("raja@gmail.com", "Raja29");
        context.setPaymentStrategy(payPalPayment);
        context.pay(150.00);
    }
}
