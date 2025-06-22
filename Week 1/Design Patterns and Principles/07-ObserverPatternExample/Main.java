public class Main {
    public static void main(String[] args) {
        StockMarket sm = new StockMarket();
        Observer m = new MobileApp("Ram");
        Observer w = new WebApp("Sam");

        sm.reg(m);
        sm.reg(w);

        System.out.println("Setting stock price at 150.0");
        sm.setSp(150.0);

        sm.dereg(w);
        
        System.out.println("Updating stock price at 175.0");
        sm.setSp(175.0);
    }
}
