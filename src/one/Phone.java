package one;

public class Phone {
    private String brand;
    private Double price;

    private String os;
    private String RAM;
    private String battery;

    public Phone() {
    }

    public Phone(String brand, Double price, String os, String RAM, String battery) {
        this.brand = brand;
        this.price = price;
        this.os = os;
        this.RAM = RAM;
        this.battery = battery;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }
}
