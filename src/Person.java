public final class Person {
    private final String surname; //Characteristics of a person important for address book
    private String street;
    private int house;
    private int flat;

    Person(String surname, String street, int house, int flat) { //Constructor of class
        this.surname = surname;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    String get() { //Receiving an address of a concrete person
        return "" + this.street + ", " + this.house + ", " + this.flat;
    }

    String getSurname() {
        return this.surname;
    }

    String getStreet() {
        return this.street;
    }

    int getHouse() {
        return this.house;
    }

    int getFlat() {
        return this.flat;
    }

    void set(String street, int house, int flat) { //Setting new address
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    void setStreet(String street){
        this.street = street;
    }

    void setHouse(int house) {
        this.house = house;
    }

    void setFlat(int flat){
        this.flat = flat;
    }
}
