// FinancialForecast.java
public class FinancialForecast {

    // Recursive method to compute future value
    public static double futureValue(double presentValue, double rate, int years) {
        // Base case: year 0 returns present value
        if (years == 0) {
            return presentValue;
        }

        // Recursive step
        return futureValue(presentValue, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double pv = 1000;    // Present Value
        double rate = 0.05;  // 5% interest
        int years = 5;

        double result = futureValue(pv, rate, years);
        System.out.printf("Future value after %d years: %.2f\n", years, result);
    }
}