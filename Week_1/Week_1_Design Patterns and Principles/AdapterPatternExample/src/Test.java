public class Test {
    public static void main(String[] args) {
        Paytm paytm = new Paytm();
        PhonePe phonepe = new PhonePe();

        PaymentProcessor paytmProcessor = new PaytmAdapter(paytm);
        PaymentProcessor phonePeProcessor = new PhonePeAdapter(phonepe);

        paytmProcessor.processPayment(100.00);
        phonePeProcessor.processPayment(200.00);
    }
}
