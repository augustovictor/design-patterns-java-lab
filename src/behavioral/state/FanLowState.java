package behavioral.state;

public class FanLowState extends State {
    private Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning on to medium");
        fan.setState(fan.getMedState());
    }

    @Override
    public String toString() {
        return "Fan is on low.";
    }
}
