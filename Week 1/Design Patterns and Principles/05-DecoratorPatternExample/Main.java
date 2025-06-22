public class Main {
    public static void main(String[] args) {
        Notifier email = new EmailNotifier("soumik@cognizant.com");
        System.out.println("For email only: ");
        email.send("Hello This is mail only.");

        Notifier emailandSms = new SMSNotifierDecorator(new EmailNotifier("soumik@cognizant.com"), 745136452);
        System.out.println("\nFor email and phone number: ");
        emailandSms.send("Hello This is mail and phone number.");

        Notifier emailandSmsandSlack = new SlackNotifierDecorator(emailandSms, "#Added Slack");
        System.out.println("\nFor email, phone number and slack:");
        emailandSmsandSlack.send("Hello This is mail, phone number and slack.");
    }
}
