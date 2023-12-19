package design_pattern.observe.payment_example;

@FunctionalInterface
public interface PaymentListener {

    void paymentMade();

}