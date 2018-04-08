package structural.proxy;

public class TwitterDemo {
    public static void main(String[] args) {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());

        System.out.println(service.getTimeLine("b01si"));

        service.postToTimeLine("victor", "Posted message to timeline...");
    }
}
