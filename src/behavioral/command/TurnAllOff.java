package behavioral.command;

import java.util.List;

public class TurnAllOff implements Command {

    List<EletronicDevice> devices;

    public TurnAllOff(List<EletronicDevice> devices) {
        this.devices = devices;
    }

    @Override
    public void execute() {
        devices.forEach(d -> d.off());
    }

    @Override
    public void undo() {
        devices.forEach(d -> d.on());
    }
}
