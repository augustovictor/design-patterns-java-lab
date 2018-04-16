package behavioral.observer;

import java.util.List;

public interface  Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers(String post);
}
