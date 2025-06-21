public class FinancialForestOptimised {
    public double iterativeForecast(double p, double[] r, int prd) {
        
        double result = p;
        for (int i = 0; i < prd; i++) {
            result *= (1 + r[i % r.length]);
        }

        return result;
    }
}
