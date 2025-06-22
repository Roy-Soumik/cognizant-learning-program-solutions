public class EmailNotifier implements Notifier{
    String email;

    public EmailNotifier(String emailAddress) {
        this.email = emailAddress;
    }

    @Override
    public void send(String msg) {
        System.out.println("Sending email to " + email + ": " + msg);
    }

}
