public class Main {

    public static void main(String[] args) {
        Car car = new Car(2000, Label.AUDI, "Red", 2.2);
        System.out.println(car.printInfo());
        car.makeVoice("Beep", 3);
        car.draw();
        car.draw("Blue");
        System.out.println("___________________________________________________________________________________");
        Bus bus = new Bus(2005,Label.HONDA,"White",2.2,15);
        System.out.println(bus.printInfo());
        bus.makeVoice("Beep - beep",3);
        bus.draw("White");
        System.out.println("___________________________________________________________________________________");
        Bus bus1 = new Bus(2019,Label.OPEL,"Black",5.5,30);
        System.out.println(bus1.printInfo());
        bus1.makeVoice("Peeep",5);
        bus1.draw("Black");

    }
}
