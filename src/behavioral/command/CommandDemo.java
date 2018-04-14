package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {
    public static void main(String[] args) {
        EletronicDevice tv = new Television();
        EletronicDevice tv2 = new Television();
        EletronicDevice tv3 = new Television();

        EletronicDevice radio = new Radio();
        EletronicDevice radio2 = new Radio();
        EletronicDevice radio3 = new Radio();
        List<EletronicDevice> deviceList = new ArrayList<>();
        deviceList.add(tv);
        deviceList.add(tv2);
        deviceList.add(tv3);
        deviceList.add(radio);
        deviceList.add(radio2);
        deviceList.add(radio3);


        TurnTvOn onCommand = new TurnTvOn(tv);
        TurnTvOff offCommand = new TurnTvOff(tv);
        TurnTvUp upCommand = new TurnTvUp(tv);
        TurnTvDown downCommand = new TurnTvDown(tv);

        DeviceButton button = new DeviceButton(onCommand);
        button.press();

        button = new DeviceButton(offCommand);
        button.press();

        button = new DeviceButton(upCommand);
        button.press();
        button.press();
        button.press();

        button = new DeviceButton(downCommand);
        button.press();
        button.pressUndo();

        TurnAllOff allOff = new TurnAllOff(deviceList);
        DeviceButton turnAllOffButton = new DeviceButton(allOff);
        turnAllOffButton.press();
        turnAllOffButton.pressUndo();

    }
}
