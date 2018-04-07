package creational.factorymethod;

class WebsiteFactory {
    static Website getWebsite(WebsiteType type) {
        switch (type) {
            case BLOG: {
                return new Blog();
            }

            case SITE: {
                return new Site();
            }

            default: return null;
        }
    }
}
