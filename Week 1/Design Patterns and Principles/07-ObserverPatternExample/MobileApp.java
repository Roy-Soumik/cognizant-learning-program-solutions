public class MobileApp implements Observer {
    String usr;

    public MobileApp(String usr) {
        this.usr = usr;
    }

    @Override
    public void update(double price) {
        System.out.println("MobileApp- Stock Price of user "+usr+" updated: $" + price);
    }

    @Override
    public String toString() {
        return usr;
    }
}
