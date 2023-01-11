package designpatterns.factory;

public class EmailNotificationService implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("EmailNotification sent");
    }
}
