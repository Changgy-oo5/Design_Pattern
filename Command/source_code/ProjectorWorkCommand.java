package pattern;

public class ProjectorWorkCommand implements Command {

    private Projector receiver;

    public ProjectorWorkCommand(Projector receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.workMode();
    }

    @Override
    public void undo() {
        receiver.off();
    }
}