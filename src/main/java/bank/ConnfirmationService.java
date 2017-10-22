package bank;

public class ConnfirmationService {

    private String name;

    public ConnfirmationService(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ConnfirmationService{" +
                "name='" + name + '\'' +
                '}';
    }
}
