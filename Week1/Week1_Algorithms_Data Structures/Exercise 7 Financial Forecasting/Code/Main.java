public class Main {

    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        } else {
            return calculateFutureValue(presentValue * (1 + growthRate), growthRate, years - 1);
        }
    }

    public static void main(String[] args) {
        double presentValue = 1000.0;
        double growthRate = 0.05;
        int years = 5;

        double futureValue = calculateFutureValue(presentValue, growthRate, years);
        System.out.printf("The future value after %d years is: %.2f%n", years, futureValue);
    }
}
