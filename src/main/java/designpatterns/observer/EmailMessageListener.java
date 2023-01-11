package designpatterns.observer;

public class EmailMessageListener implements Listener{

    private String email;

    public EmailMessageListener(String email){
        this.email = email;
    }

    @Override
    public void update(EventType eventType) {
        System.out.println("sending email to : "+email+" for evenType : " + eventType);
    }
}
