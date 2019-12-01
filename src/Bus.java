public final class Bus extends Car {
    private int passengerSeat;

    public Bus(int age, Label label, Garage garage, String color, double volume, int passengerSeat) {
        super(age, label, garage, color, volume);
        this.passengerSeat = passengerSeat;
    }

    public int getPassengerSeat() {
        return passengerSeat;
    }

    @Override
    void makeVoice(String voice, int number) {
        super.makeVoice(voice, number);
    }

    @Override
    public String printInfo() {
        return super.printInfo() + " Количество мест ("+getPassengerSeat() +")";
    }

    @Override
    void draw(String color) {
        super.draw(color);
    }
}
