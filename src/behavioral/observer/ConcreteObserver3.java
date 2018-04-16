package behavioral.observer;

public class ConcreteObserver3 implements Observer {
    @Override
    public void update(String post) {
        System.out.println("Observer 3 received the post: " + post);
    }
}
