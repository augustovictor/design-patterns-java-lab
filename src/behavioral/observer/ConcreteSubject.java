package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

    private List<Observer> observers;
    private String status;
    private String channelName;

    public Channel(String status, String channelName) {
        this.observers = new ArrayList<>();
        this.status = status;
        this.channelName = channelName;
    }

    @Override
    public void registerObserver(Observer observer) {
        System.out.println("Subscribed: " + observer.toString());
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        System.out.println("Unsubscribed: " + observer.toString());
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String post) {
        System.out.println("Notification sent!");
        observers.forEach(o -> o.update(post));
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}