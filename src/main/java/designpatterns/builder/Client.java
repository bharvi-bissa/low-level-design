package designpatterns.builder;

public class Client {

    public static void main(String[] args) {
        Customer customer1 = new CustomerBuilder()
                .firstName("John")
                .lastName("Doe")
                .email("john_doe@example.com")
                .build();

        Customer customer2 = new CustomerBuilder()
                .firstName("Jane")
                .lastName("Doe")
                .build();

        System.out.println("Customer1 : " + customer1);
        System.out.println("Customer2 : " + customer2);

        Computer computer1 = new ComputerBuilder("16GB","i5","500GB")
                .isBluetoothEnabled(true)
                .isGraphicCardEnabled(true)
                .build();

        Computer computer2 = new ComputerBuilder("32GB","i7","1TB")
                .isBluetoothEnabled(true)
                .build();

        System.out.println("computer1 "+computer1);
        System.out.println("computer2 "+computer2);
    }
}
