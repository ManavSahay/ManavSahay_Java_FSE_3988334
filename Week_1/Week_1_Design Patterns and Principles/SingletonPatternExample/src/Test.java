public class Test {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Logger 1 message.");
        logger2.log("Logger 2 message.");

        if (logger1 == logger2) {
            System.out.println("Logger1 and Logger2 refer to the same instance.");
        } else {
            System.out.println("Logger1 and Logger2 refer to different instances.");
        }
    }
}
