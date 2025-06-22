public class Main {
    public static void main(String[] args) {
        Logger.getInstance().logDetails("Application has started.");
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();
        log1.logDetails("Log 1 initiated.");
        log2.logDetails("Log 2 initiated.");

        if(log1==log2){
            System.out.println("Only one instance of Logger is created and used across the application");
        } else {
            System.out.println("More than one instance of Logger is being used.");
        }
    }
}
