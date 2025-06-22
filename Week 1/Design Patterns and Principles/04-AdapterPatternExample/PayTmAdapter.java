public class PayTmAdapter implements PaymentProcessor{
    PayTmGateway paytm;

    public PayTmAdapter(PayTmGateway paytm) {
        this.paytm = paytm;
    }

    @Override
    public void processPayment(double amt) {
        paytm.paytmSend(amt);
    }
}
