public class Transport {
    private int age;
    private Label label;
    private Garage garage;

    public Transport(int age, Label label, Garage garage) {
        this.age = age;
        this.label = label;
        this.garage = garage;
    }

    public int getAge() {
        return age;
    }

    public Label getLabel() {
        return label;
    }

    public Garage getGarage() {
        return garage;
    }

    public String printInfo() {
        return "Год выпуска (" + getAge() + ") " + "Марка (" + getLabel() + ") " + "Адрес (" + garage.getAddress() + ")";
    }
}
