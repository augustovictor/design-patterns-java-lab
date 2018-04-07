package creational.factorymethod;

class WebsiteDemo {
    public static void main(String[] args) {
        Website blog = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        if (blog != null) {
            System.out.println(blog.getPages());
        }

        Website site = WebsiteFactory.getWebsite(WebsiteType.SITE);
        if(site != null) {
            System.out.println(site.getPages());
        }
    }
}
