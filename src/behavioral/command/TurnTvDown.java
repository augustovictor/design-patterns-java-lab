package behavioral.command;

public class TurnTvDown implements Command {
    private EletronicDevice device;

    public TurnTvDown(EletronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }

    @Override
    public void undo() {
        device.volumeUp();
    }
}
