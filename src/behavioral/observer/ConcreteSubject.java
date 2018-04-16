package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private List<Observer> observers;

    public ConcreteSubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        System.out.println("Subscribed: " + observer.toString());
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        System.out.println("Unsubscribed: " + observer.toString());
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String post) {
        System.out.println("Notification sent!");
        observers.forEach(o -> o.update(post));
    }


}

