public class GPayAdapter implements PaymentProcessor {
    GPayGateway gpay;

    public GPayAdapter(GPayGateway gpay) {
        this.gpay = gpay;
    }

    @Override
    public void processPayment(double amt) {
        gpay.gPaySend(amt);
    }
}