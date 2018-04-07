package creational.factorymethod;

class Blog extends Website {
    @Override
    public void createWebsite() {
        pages.add(new HomePage());
        pages.add(new ContactPage());
    }
}
