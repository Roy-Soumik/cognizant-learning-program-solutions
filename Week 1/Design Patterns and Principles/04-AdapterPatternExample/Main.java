public class Main {
    public static void main(String[] args) {
        GPayGateway gpay = new GPayGateway();
        PayTmGateway paytm = new PayTmGateway();
        PhonePayGateway pp = new PhonePayGateway();

        PaymentProcessor gpayP = new GPayAdapter(gpay);
        PaymentProcessor paytmP = new PayTmAdapter(paytm);
        PaymentProcessor phonePayP = new PhonePayAdapter(pp);

        System.out.print("Google Pay: ");
        gpayP.processPayment( 50.0 );

        System.out.print("\nPayTm: ");
        paytmP.processPayment( 75.5 );

        System.out.print("\nPhonePe: ");
        phonePayP.processPayment( 100.25 );
    }
}
