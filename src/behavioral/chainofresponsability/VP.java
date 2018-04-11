package behavioral.chainofresponsability;

public class VP extends Handler {
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType().equals(RequestType.PURCHASE) && request.getAmount() < 500) {
            System.out.println("VP can approve purchases...");
        } else {
            successor.handleRequest(request);
        }
    }
}
