package pattern;

public class CurtainDownCommand implements Command {

    private Curtain receiver;

    public CurtainDownCommand(Curtain receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.down();
    }

    @Override
    public void undo() {
        receiver.up();
    }
}