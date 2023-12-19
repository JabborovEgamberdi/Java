package design_pattern.observe.payment_example;

public class PaymentEventLogger implements PaymentListener {


    @Override
    public void paymentMade() {
        logEvent();
    }

    private void logEvent() {
        System.out.println("Payment Received");
    }

    private void logEvent(String message) {
        System.out.println(STR."Message: \{message}");
    }

}
