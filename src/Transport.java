public class Transport {
    private int age;
    private Label label;

    public Transport(int age, Label label) {
        this.age = age;
        this.label = label;
    }

    public int getAge() {
        return age;
    }

    public Label getLabel() {
        return label;
    }
public String printInfo(){
        return "Год выпуска ("+getAge()+") "+ "Марка ("+getLabel()+") ";
}
}
