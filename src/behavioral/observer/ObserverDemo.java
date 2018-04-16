package behavioral.observer;

public class ObserverDemo {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer ob1 = new ConcreteObserver1();
        Observer ob2 = new ConcreteObserver2();
        Observer ob3 = new ConcreteObserver3();

        subject.subscribe(ob1);
        subject.subscribe(ob2);
        subject.subscribe(ob3);

        subject.notifyObservers("New post from victor");

        subject.unsubscribe(ob3);

        subject.notifyObservers("New private post");

    }
}
