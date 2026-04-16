package pattern;

public class RadioButton extends Button {

    public RadioButton(ButtonSize size) {
        super(size);
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + size.getSize() + " Radio Button");
    }
}
