public class SlackNotifierDecorator extends NotifierDecorator {
    private String channel;

    public SlackNotifierDecorator(Notifier wrap, String channel) {
        super(wrap);
        this.channel = channel;
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        System.out.println("Sending slack to " + channel + ": " + msg);
    }
}