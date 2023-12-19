package design_pattern.observe.payment_example;

public class NotificationManager implements PaymentListener {

    @Override
    public void paymentMade() {
        notificationSend();
    }

    private void notificationSend() {
        System.out.println("Notification sent");
    }

}
