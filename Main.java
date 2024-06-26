import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Person> peopleByName = new TreeSet<>(new PersonNameComparator());
        TreeSet<Person> peopleByAge = new TreeSet<>(new PersonAgeComparator());

        peopleByName.add(new Person("Alice", 30));
        peopleByName.add(new Person("Bob", 25));
        peopleByName.add(new Person("Charlie", 35));

        peopleByAge.addAll(peopleByName);

        System.out.println("People sorted by name:");
        for (Person person : peopleByName) {
            System.out.println(person);
        }

        System.out.println("\nPeople sorted by age:");
        for (Person person : peopleByAge) {
            System.out.println(person);
        }

        Country usa = new Country("USA");
        Country canada = new Country("Canada");

        Address address1 = new Address("123 Main St", usa);
        Address address2 = new Address("456 Maple St", canada);

        Hobby cycling = new Hobby("Cycling", 3, List.of(address1, address2));
        Hobby swimming = new Hobby("Swimming", 2, List.of(address1));

        Map<Person, List<Hobby>> personHobbies = new HashMap<>();

        Person alice = new Person("Alice", 30);
        Person bob = new Person("Bob", 25);

        personHobbies.put(alice, List.of(cycling, swimming));
        personHobbies.put(bob, List.of(swimming));

        System.out.println("\nHobbies and countries for Alice:");
        List<Hobby> aliceHobbies = personHobbies.get(alice);
        if (aliceHobbies != null) {
            for (Hobby hobby : aliceHobbies) {
                System.out.println("Hobby: " + hobby.getName());
                for (Address address : hobby.getAddresses()) {
                    System.out.println("Practiced in: " + address.getCountry().getName());
                }
            }
        }
    }
}
