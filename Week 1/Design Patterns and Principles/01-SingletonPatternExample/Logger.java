public class Logger {

    private static Logger log = null;
    private Logger(){

    };

    public static Logger getInstance(){
        if(log == null){
            log = new Logger();
        }
        return log;
    }

    public void logDetails(String str){
        System.out.println(str);
    }
}