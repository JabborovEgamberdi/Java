package design_pattern.observe.payment_example;

public class Main {
    public static void main(String[] args) {
        PaymentManager paymentManager = new PaymentManager();
        NotificationManager notificationManager = new NotificationManager();
        PaymentEventLogger paymentEventLogger = new PaymentEventLogger();
        paymentManager.registerPaymentListener(notificationManager);
        paymentManager.registerPaymentListener(paymentEventLogger);
        paymentManager.pay();
        paymentManager.removePaymentListener(paymentEventLogger);
        paymentManager.pay();
    }
}