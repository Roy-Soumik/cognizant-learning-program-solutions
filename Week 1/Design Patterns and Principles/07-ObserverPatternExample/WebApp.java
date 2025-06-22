public class WebApp implements Observer {
    String usr;

    public WebApp(String usr) {
        this.usr = usr;
    }
    
    @Override
    public void update(double price) {
        System.out.println("WebApp- Stock Price of user "+usr+" updated: " + price);
    }

    @Override
    public String toString() {
        return usr;
    }
}