package design_pattern.observe.payment_example;

import java.util.ArrayList;
import java.util.List;

public class PaymentManager {

//    private final NotificationManager notificationManager = new NotificationManager();
//    private final PaymentEventLogger paymentEventLogger = new PaymentEventLogger();

    List<PaymentListener> paymentListeners = new ArrayList<>();

    public void registerPaymentListener(PaymentListener paymentListener) {
        paymentListeners.add(paymentListener);
    }

    public void removePaymentListener(PaymentListener paymentListener) {
        paymentListeners.remove(paymentListener);
    }

    public void pay() {
        paymentListeners.forEach(PaymentListener::paymentMade);
//        notificationManager.notificationSend();
//        paymentEventLogger.logEvent();
    }

}