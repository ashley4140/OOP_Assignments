public class Bike {
    private String name;
    private int value;
    private String make;

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String getMake() {
        return make;
    }

    public void setName(String name) {
        System.out.print("\n\nWhat is your name: " +name);
        this.name = name;
    }

    public void setValue(int value) {
        System.out.print("\n\nHow much is your bike: "+value);
        this.value = value;
    }

    public void setMake(String make) {
        System.out.print("\n\nWhat make is your bike: "+make);
        this.make = make;
    }

    public Bike() {
        this("Oliver",250, "Trek");
    }

    public Bike(String name, int value, String make) {
        setName(name);
        setValue(value);
        setMake(make);
    }

    @Override
    public String toString() {
        return new String();
    }
}
