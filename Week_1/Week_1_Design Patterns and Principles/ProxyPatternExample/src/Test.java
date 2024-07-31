public class Test {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("http://example.com/image1.jpg");

        image1.display();
        System.out.println();

        image1.display();
    }
}
