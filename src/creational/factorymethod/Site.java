package creational.factorymethod;

class Site extends Website {
    @Override
    public void createWebsite() {
        pages.add(new HomePage());
        pages.add(new ContentPage());
    }
}
