package designpatterns.factory;

public class SmsNotificationService implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("SmsNotificationService sent");
    }
}
