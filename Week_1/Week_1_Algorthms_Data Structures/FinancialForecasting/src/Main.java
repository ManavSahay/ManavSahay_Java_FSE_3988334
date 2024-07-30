public class Main {
    public static double calculateFutureValue(double value, double growthRate, int years) {
        if (years == 0) {
            return value;
        }
        return calculateFutureValue(value * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double value = 100.0;
        double growthRate = 0.5;
        int years = 5;

        double value_new = calculateFutureValue(value, growthRate, years);
        System.out.println("Future Value: " + value_new);
    }
}