package two;

public class Phone {
    private String name;
    private String storage;
    private String color;

    public Phone() {
    }

    public Phone(String name, String storage, String color) {
        this.name = name;
        this.storage = storage;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", storage='" + storage + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
