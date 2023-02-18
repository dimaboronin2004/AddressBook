import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class AddressBook {

    private final List<Person> list = new ArrayList<>(); //List of people as a base of an address book

    AddressBook(Person...people) { //Constructor of class
        Collections.addAll(list, people);
    }

    public void addPerson(Person person) { //Addition of a new person
        if (!list.contains(person)) list.add(person);
    }

    public void deletePerson(Person person) { //Removing of a person from a book
        list.remove(person);
    }

    public void setAddress(Person person, String street, int house, int flat) { //Setting a new address for a person
        person.set(street, house, flat);
    }

    public String getAddress(Person person) { //Receiving an address of a person
        return person.get();
    }

    public List<String> findByStreet(String street) { //Finding people living on a particular street
        List<String> output = new ArrayList<>();
        for (Person person: list) {
            if (person.getStreet().equals(street)) {
                output.add(person.getSurname());
            }
        }
        return output;
    }

    public List<String> findByHouse(int house) { //Finding people living in a particular house
        List<String> output = new ArrayList<>();
        for (Person person: list) {
            if (person.getHouse() == house) {
                output.add(person.getSurname());
            }
        }
        return output;
    }
}
