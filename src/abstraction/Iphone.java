package abstraction;

public class Iphone extends Mobile{

    public Iphone(double price, String osType, String name) {
        super(price, osType, name);
    }

    @Override
    public void sendMessage(String name) {
        System.out.println("Sending Message From : " + name);
    }

    @Override
    void makeCall() {
        System.out.println("Making a call from Iphone");
    }
}
