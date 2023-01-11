package designpatterns.observer;

public class MainApp {

    public static void main(String[] args) {
        Store store = new Store();

        EmailMessageListener emailMessageListener1 = new EmailMessageListener("john@example.com");
        EmailMessageListener emailMessageListener2 = new EmailMessageListener("jane@example.com");

        MobileMessageListener mobileMessageListener1 = new MobileMessageListener("8986555478");
        MobileMessageListener mobileMessageListener2 = new MobileMessageListener("8286555478");

        store.getNotificationService().subscribe(EventType.NEW_ITEM, emailMessageListener1);
        store.getNotificationService().subscribe(EventType.SALE_PROMOTION,emailMessageListener2);
        store.getNotificationService().subscribe(EventType.NEW_ITEM,mobileMessageListener1);
        store.getNotificationService().subscribe(EventType.SALE_PROMOTION,mobileMessageListener2);

        store.newItemPromotion();
        store.saleItemPromotion();

        store.getNotificationService().unsubscribe(EventType.SALE_PROMOTION,mobileMessageListener2);
        System.out.println("unsubscribed mobileMessageListener2 for SALE_PROMOTION");

        store.saleItemPromotion();

    }

}
