public class Car extends Transport {
    private String color;
    private double volume;

    public Car(int age, Label label, Garage garage, String color, double volume) {
        super(age, label, garage);
        this.color = color;
        this.volume = volume;
    }

    void makeVoice(String voice, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice + " " + i + " " + "раз");
            voice+="/"+ voice;

        }
    }

    final void draw() {
        System.out.println("\uD83D\uDE97");
    }

    void draw(String color) {
        System.out.println("\uD83D\uDE97" + color);
    }

    public String getColor() {
        return color;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + " Цвет (" + getColor() + ") " + " Обьем (" + getVolume() + ")";
    }
}
