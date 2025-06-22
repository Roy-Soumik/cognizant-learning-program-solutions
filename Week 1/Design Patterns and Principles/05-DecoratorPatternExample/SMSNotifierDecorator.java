public class SMSNotifierDecorator  extends NotifierDecorator {
    private long pno;

    public SMSNotifierDecorator(Notifier wrap, long pno) {
        super(wrap);
        this.pno = pno;
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        System.out.println("Sending SMS to " + pno + ": " + msg);
    }
}
