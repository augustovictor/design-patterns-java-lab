package behavioral.command;

public class TurnTvOff implements Command {

    EletronicDevice device;

    public TurnTvOff(EletronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }

    @Override
    public void undo() {
        device.on();
    }
}
