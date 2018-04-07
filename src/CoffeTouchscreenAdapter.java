public class CoffeTouchscreenAdapter implements CoffeeMachineInterface{

    private OldCoffeeMachine oldCoffeeMachine;

    public CoffeTouchscreenAdapter(OldCoffeeMachine oldCoffeeMachine) {
        this.oldCoffeeMachine = oldCoffeeMachine;
    }

    @Override
    public void chooseFirstSelection() {
        this.oldCoffeeMachine.selectA();
    }

    @Override
    public void chooseSecondOption() {
        this.oldCoffeeMachine.selectB();
    }
}