package revision;

public class Suburb {
    private String name;
    private String city;
    private State state;
    private String postalCode;

    public Suburb(String name, String city, State state, String postalCode) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return name + ":" + city + ":" + state + ":" + postalCode;
    }
}
