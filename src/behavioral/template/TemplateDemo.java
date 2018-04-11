package behavioral.template;

public class TemplateDemo {
    public static void main(String[] args) {
        System.out.println("Web order:");

        OrderTemplate webOrder = new WebOrder();
        OrderTemplate storeOrder = new StoreOrder();

        webOrder.processOrder();
        storeOrder.processOrder();
    }
}
