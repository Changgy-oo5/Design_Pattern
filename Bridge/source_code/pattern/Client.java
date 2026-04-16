package pattern;

public class Client {

    public static void main(String[] args) {

        Button btn1 = new RadioButton(new SmallSize());
        btn1.draw();

        Button btn2 = new CheckboxButton(new MediumSize());
        btn2.draw();

        Button btn3 = new DropdownButton(new LargeSize());
        btn3.draw();
    }
}