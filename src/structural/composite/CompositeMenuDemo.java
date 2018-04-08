package structural.composite;

public class CompositeMenuDemo {
    public static void main(String[] args) {
        Menu mainMenu  = new Menu("Main", "/main");

        MenuItem myAccountMenu = new MenuItem("My account", "/my-account");
        MenuItem settingsMeny = new MenuItem("Settings", "/settings");

        Menu payment = new Menu("Payment", "/payment");
        MenuItem paymentUpdate = new MenuItem("Payment update", "/payment/update");

        payment.add(paymentUpdate);

        mainMenu.add(myAccountMenu);
        mainMenu.add(settingsMeny);
        mainMenu.add(payment);

        System.out.println(mainMenu.toString());
    }
}
