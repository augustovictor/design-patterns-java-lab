package behavioral.command;

public class TurnTvOn implements Command {

    EletronicDevice device;

    public TurnTvOn(EletronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }
}
