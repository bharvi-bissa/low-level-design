package designpatterns.observer;

import java.util.*;

public class NotificationService {

    public Map<EventType, List<Listener>> eventToCustomerMap;

    NotificationService(){
        eventToCustomerMap = new HashMap<>();
        Arrays.stream(EventType.values()).forEach(event -> eventToCustomerMap.put(event,new ArrayList<>()));
    }

    public void subscribe(EventType eventType, Listener listener){
        eventToCustomerMap.get(eventType).add(listener);
    }

    public void unsubscribe(EventType eventType, Listener listener){
        eventToCustomerMap.get(eventType).remove(listener);
    }

    public void notifyCustomers(EventType eventType){
        eventToCustomerMap.get(eventType).forEach(listener -> listener.update(eventType));
    }
}
