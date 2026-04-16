package pattern;

//Abstraction
public abstract class Button {

    protected ButtonSize size;

    public Button(ButtonSize size) {
        this.size = size;
    }

    public abstract void draw();
}
