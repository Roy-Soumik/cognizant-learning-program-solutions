public class Main {

    public static void main(String[] args) {
        FinancialForecast f = new FinancialForecast();
        double[] r = {0.05, 0.03}; 
        double amt = 1000.0;
        int y = 4;

        double res = f.recursiveForecast(amt, r, y);
        System.out.printf("Value after "+ y + " years is "+ res);
    }
}
