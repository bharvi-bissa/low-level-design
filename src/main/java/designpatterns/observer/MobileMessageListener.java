package designpatterns.observer;

public class MobileMessageListener implements Listener{

    private String mobileNumber;

    public MobileMessageListener(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void update(EventType eventType) {
        System.out.println("sending SMS notification to : "+mobileNumber+" for evenType : " + eventType);
    }
}
