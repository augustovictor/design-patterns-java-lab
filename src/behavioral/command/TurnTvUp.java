package behavioral.command;

public class TurnTvUp implements Command {

    EletronicDevice device;

    public TurnTvUp(EletronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }

    @Override
    public void undo() {
        device.volumeDown();
    }
}
