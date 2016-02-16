package creational.builder;

/**
 * Created by jarydu on 2/16/16.
 */
public class BuilderDemo {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("Jary", "SJ", "CA")
            .city("SJ")
            .state("CA")
            .streetAddress("2049 Venturi")
            .isFemale(false)
            .isEmployed(true)
            .isHomeOwner(true)
            .build();
    }
}
