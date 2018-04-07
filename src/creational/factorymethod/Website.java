package creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

abstract class Website {
    List<Page> pages = new ArrayList<>();

    List<Page> getPages() {
        return pages;
    }

    Website() {
        this.createWebsite();
    }

    abstract void createWebsite();
}
