package abstraction;

public abstract class Mobile {

    private double price;

    private String osType;

    private String name;

    public Mobile(double price, String osType, String name) {
        this.price = price;
        this.osType = osType;
        this.name = name;
    }

    public abstract void sendMessage(String name); //abstract method

    abstract void makeCall(); //abstract method

    public void playMusic(){ //concrete method which has body implementation
        System.out.println("Song is playing");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
