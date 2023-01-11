package designpatterns.factory;

public class FactoryMain {

    public static void main(String[] args) {
        String emailNotificationService = "EmailNotificationService";
        String smsNotificationService = "SmsNotificationService";
        NotificationServiceFactory factory = new NotificationServiceFactory();
        NotificationService emailNotificationServiceObj = factory.getNotificationService(emailNotificationService);
        NotificationService smsNotificationServiceObj = factory.getNotificationService(smsNotificationService);
        emailNotificationServiceObj.sendNotification();
        smsNotificationServiceObj.sendNotification();
    }
}
