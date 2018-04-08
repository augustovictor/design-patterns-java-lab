package structural.proxy;

public class TwitterServiceImpl implements TwitterService {
    @Override
    public String getTimeLine(String screenName) {
        return "Returned timeline...";
    }

    @Override
    public void postToTimeLine(String screenName, String message) {
        System.out.println("Posted tom timeline: " + screenName + ": " + message);
    }
}
