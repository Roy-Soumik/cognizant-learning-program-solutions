public abstract class NotifierDecorator implements Notifier {
    Notifier wrap;

    public NotifierDecorator(Notifier wrap) {
        this.wrap = wrap;
    }

    @Override
    public void send(String msg) {
        wrap.send(msg);
    }
}
