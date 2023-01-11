package designpatterns.builder;

public class Computer {

    //required fields
    private String ram;
    private String cpu;
    private String hdd;

    //optional fields
    private boolean isGraphicCardEnabled;
    private boolean isBluetoothEnabled;

    public Computer(ComputerBuilder computerBuilder){
        this.ram = computerBuilder.getRam();
        this.cpu = computerBuilder.getCpu();
        this.hdd = computerBuilder.getHdd();
        this.isGraphicCardEnabled = computerBuilder.isGraphicCardEnabled();
        this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled();
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

    @Override
    public String toString() {
        return "Computer{" +
                "ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                ", hdd='" + hdd + '\'' +
                ", isGraphicCardEnabled=" + isGraphicCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }
}
