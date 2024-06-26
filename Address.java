public class Address {
    private String street;
    private Country country;

    public Address(String street, Country country) {
        this.street = street;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Address{street='" + street + "', country=" + country + "}";
    }
}
