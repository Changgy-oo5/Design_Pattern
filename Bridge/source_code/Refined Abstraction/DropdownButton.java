package pattern;

public class DropdownButton extends Button {

    public DropdownButton(ButtonSize size) {
        super(size);
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + size.getSize() + " Dropdown Button");
    }
}
