package structural.decorator;

public class DressingDecorator extends SandwichDecorator {
    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make() {
        return customSandwich.make() + addDressign();
    }

    private String addDressign() {
        return " + mustard";
    }
}
