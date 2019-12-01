public class Main {

    public static void main(String[] args) {
        Garage garage = new Garage("Bishkek");
        Car car = new Car(2000, Label.AUDI, garage, "Red", 2.2);
        System.out.println(car.printInfo());
        car.makeVoice("Beep", 3);
        car.draw();
        car.draw("Blue");
        System.out.println("___________________________________________________________________________________");
        Bus bus = new Bus(2005,Label.HONDA,garage,"White",2.2,15);
        System.out.println(bus.printInfo());
        bus.makeVoice("Beep - beep",3);
        bus.draw("White");
        System.out.println("___________________________________________________________________________________");
        Bus bus1 = new Bus(2019,Label.OPEL,garage,"Black",5.5,30);
        System.out.println(bus1.printInfo());
        bus1.makeVoice("Peeep",5);
        bus1.draw("Black");

    }
}
