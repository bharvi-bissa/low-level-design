package designpatterns.observer;

public class Store {

    private final NotificationService notificationService;

    public Store(){
        this.notificationService = new NotificationService();
    }

    public void newItemPromotion(){
        notificationService.notifyCustomers(EventType.NEW_ITEM);
    }

    public void saleItemPromotion(){
        notificationService.notifyCustomers(EventType.SALE_PROMOTION);
    }

    public NotificationService getNotificationService(){
        return notificationService;
    }
}
