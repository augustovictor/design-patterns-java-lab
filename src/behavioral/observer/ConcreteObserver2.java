package behavioral.observer;

public class ConcreteObserver2 implements Observer {
    @Override
    public void update(String post) {
        System.out.println("Observer 2 received the post: " + post);
    }
}
