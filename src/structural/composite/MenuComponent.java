package structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
    String name;
    String url;
    List<MenuComponent> menuComponents = new ArrayList<>();

    public String getName() {
        return name;
    }

    MenuComponent add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    MenuComponent remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public String getUrl() {
        return url;
    }

    public abstract String toString();

    String print(MenuComponent menuComponent) {
        return menuComponent.getName() + ":" + menuComponent.getUrl() + "\n";
    }
}
