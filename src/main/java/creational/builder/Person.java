package creational.builder;

/**
 * Created by jarydu on 2/16/16.
 */
public class Person {

    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final String streetAddress;
    private final String city;
    private final String state;
    private final boolean isFemale;
    private final boolean isEmployed;
    private final boolean isHomeOwner;

    public Person(
        final String firstName,
        final String lastName,
        final String middleName,
        final String streetAddress,
        final String city,
        final String state,
        final boolean isFemale,
        final boolean isEmployed,
        final boolean isHomeOwner
    ) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.isFemale = isFemale;
        this.isEmployed = isEmployed;
        this.isHomeOwner = isHomeOwner;
    }

    public static class PersonBuilder {

        private String nestedLastName;
        private String nestedFirstName;
        private String nestedMiddleName;
        private String nestedSalutation;
        private String nestedSuffix;
        private String nestedStreetAddress;
        private String nestedCity;
        private String nestedState;
        private boolean nestedIsFemale;
        private boolean nestedIsEmployed;
        private boolean nestedIsHomeOwner;

        public PersonBuilder(final String newFirstName, final String newLastName, final String newMiddleName) {
            this.nestedFirstName = newFirstName;
            this.nestedLastName = newLastName;
            this.nestedMiddleName = newMiddleName;
        }

        public PersonBuilder streetAddress(String newStreetAddress) {
            this.nestedStreetAddress = newStreetAddress;
            return this;
        }

        public PersonBuilder city(String newCity) {
            this.nestedCity = newCity;
            return this;
        }

        public PersonBuilder state(String newState) {
            this.nestedState = newState;
            return this;
        }

        public PersonBuilder isFemale(boolean newIsFemale) {
            this.nestedIsFemale = newIsFemale;
            return this;
        }

        public PersonBuilder isEmployed(boolean newIsEmployed) {
            this.nestedIsEmployed = newIsEmployed;
            return this;
        }

        public PersonBuilder isHomeOwner(boolean newIsHomeOwner) {
            this.nestedIsHomeOwner = newIsHomeOwner;
            return this;
        }

        public Person build() {
            return new Person(nestedLastName, nestedFirstName, nestedMiddleName, nestedStreetAddress, nestedCity,
                nestedState, nestedIsFemale, nestedIsEmployed, nestedIsHomeOwner);
        }
    }
}
