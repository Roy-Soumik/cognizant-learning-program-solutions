public class logger {

    private static logger log = null;
    private logger(){

    };

    public static logger getInstance(){
        if(log == null){
            log = new logger();
        }
        return log;
    }

    public void logDetails(String str){
        System.out.println(str);
    }
}