package abstraction;

public class Main {
    public static void main(String[] args) {
        Mobile onePlus = new OnePlus(34999,"android","OnePlus");
        Mobile samsung = new Samsung(27599,"android","Samsung");
        Mobile iphone = new Iphone(69999,"ios","Iphone");
        onePlus.sendMessage(onePlus.getName());
        samsung.sendMessage(samsung.getName());
        iphone.sendMessage(iphone.getName());
        onePlus.makeCall();
        iphone.makeCall();
        samsung.makeCall();
    }
}
