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

    public interface Subject {
    }

    public class Channel implements behavioral.observer.Subject {
        @Override
        public void subscribe(behavioral.observer.Observer observer) {

        }

        @Override
        public void unsubscribe(behavioral.observer.Observer observer) {

        }

        @Override
        public void notifyObservers(String post) {

        }
    }

    public interface Observer {
        public void update(String status);
    }

    public class Follower implements behavioral.observer.Observer {

    }
}

