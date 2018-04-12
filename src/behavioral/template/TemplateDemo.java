package behavioral.template;

public class TemplateDemo {
    public static void main(String[] args) {
        System.out.println("Web order:");

        OrderTemplate webOrder = new WebOrder();
        OrderTemplate storeOrder = new StoreOrder();

        webOrder.processOrder();
        storeOrder.processOrder();
    }
}

abstract class SelfDrivingTemplate {

    public abstract void start();
    public abstract void drive();
    public abstract void activateBreak();
    public abstract void accelerate();

    public final void driveToDestination() {
        start();
        accelerate();
        drive();
        activateBreak();
        reachDestination();
    }

    private void reachDestination() {
        System.out.println("Reached destination");
    }
}

class SelfDrivingCar extends SelfDrivingTemplate {

    @Override
    public void start() {
        System.out.println("Starting car...");
    }

    @Override
    public void drive() {
        System.out.println("Driving safely...");
    }

    @Override
    public void activateBreak() {
        System.out.println("BReAk!");
    }

    @Override
    public void accelerate() {
        System.out.println("bruuum.... Accelerating!");
    }
}