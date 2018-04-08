package structural.adapter;

public class LegacyEmployeeAdapter implements Employee {

    private LegacyEmployee instance;

    public LegacyEmployeeAdapter(LegacyEmployee instance) {
        this.instance = instance;
    }

    @Override
    public int getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }
}
