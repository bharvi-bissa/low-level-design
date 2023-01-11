package designpatterns.builder;

public class ComputerBuilder {

    //required fields
    private String ram;
    private String cpu;
    private String hdd;

    //optional fields
    private boolean isGraphicCardEnabled;
    private boolean isBluetoothEnabled;

    public ComputerBuilder(String ram, String cpu, String hdd){
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    public ComputerBuilder isGraphicCardEnabled(boolean isGraphicCardEnabled){
        this.isGraphicCardEnabled = isGraphicCardEnabled;
        return this;
    }

    public ComputerBuilder isBluetoothEnabled(boolean isBluetoothEnabled){
        this.isBluetoothEnabled = isBluetoothEnabled;
        return this;
    }

    public Computer build(){
        return new Computer(this);
    }

    public String getRam() {
        return ram;
    }

    public String getCpu() {
        return cpu;
    }

    public String getHdd() {
        return hdd;
    }

    public boolean isGraphicCardEnabled() {
        return isGraphicCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }
}
