package behavioral.template.chainofresponsability;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Director p1 = new Director();
        VP p2 = new VP();
        CEO p3 = new CEO();

        p1.setSuccessor(p2);
        p2.setSuccessor(p3);

        Request request = new Request(RequestType.CONFERENCE, 300);
        p1.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 300);
        p1.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        p1.handleRequest(request);
    }
}
