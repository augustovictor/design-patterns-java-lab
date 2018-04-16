package behavioral.observer;

public class ConcreteObserver1 implements Observer {
    @Override
    public void update(String post) {
        System.out.println("Observer 1 received the post: " + post);
    }
}
