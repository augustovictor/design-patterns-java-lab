package creational.singleton;

public class DbSingleton {
    private static DbSingleton dbSingletonInstance = new DbSingleton();

    private DbSingleton() {}

    public static DbSingleton getInstance() {
        return dbSingletonInstance;
    }
}
