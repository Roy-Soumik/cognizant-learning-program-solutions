public class PhonePayAdapter implements PaymentProcessor{
    PhonePayGateway phonepay; 

    public PhonePayAdapter(PhonePayGateway phonepay) {
        this.phonepay = phonepay;
    }

    @Override
    public void processPayment(double amt) {
        phonepay.phonePaySend(amt);
    }
}
