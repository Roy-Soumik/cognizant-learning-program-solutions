public interface Stock {
    void reg(Observer observer);
    void dereg(Observer observer);
    void notifys();
}