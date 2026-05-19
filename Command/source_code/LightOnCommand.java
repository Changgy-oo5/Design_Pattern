package pattern;

public class LightOnCommand implements Command {

    private Light receiver;

    public LightOnCommand(Light receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.on();
    }

    @Override
    public void undo() {
        receiver.off();
    }
}