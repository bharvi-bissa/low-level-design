package designpatterns.factory;
/*
* https://www.geeksforgeeks.org/factory-method-design-pattern-in-java/?ref=rp
* */
public class NotificationServiceFactory {

    public NotificationService getNotificationService(String notificationType){
        if(notificationType == null || notificationType.isEmpty()){
            return null;
        }
        else if("SmsNotificationService".equals(notificationType)){
            return new SmsNotificationService();
        }
        else if("EmailNotificationService".equals(notificationType)){
            return new EmailNotificationService();
        }
        return null;
    }
}
