import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    List<Observer> obs = new ArrayList<>();
    double sp;
    
    public void setSp(double sp) {
        this.sp = sp;
        notifys();
    }

    @Override
    public void reg(Observer ob) {
        System.out.println("User " +ob+" is registered.");
        obs.add(ob);
    }

    @Override
    public void dereg(Observer ob) {
        System.out.println("User " +ob+" is deregistered.");
        obs.remove(ob);
    }

    @Override
    public void notifys() {
        for (Observer ob : obs) {
            ob.update(sp);
        }
    }

}
