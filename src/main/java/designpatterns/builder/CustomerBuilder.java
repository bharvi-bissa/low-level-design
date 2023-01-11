package designpatterns.builder;

public class CustomerBuilder {

    private String firstName;
    private String lastName;
    private String email;

    public CustomerBuilder firstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public CustomerBuilder lastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public CustomerBuilder email(String email){
        this.email = email;
        return this;
    }

    public Customer build() {
        return new Customer(this);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
