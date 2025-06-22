public class FinancialForecast {

    public double recursiveForecast(double p, double[] r, int prd){
        if (prd == 0) {
            return p;
        }
        double rate = r[(prd - 1) % r.length];
        double prev = recursiveForecast(p, r, prd - 1);
        return prev * (1 + rate);
    } 

}