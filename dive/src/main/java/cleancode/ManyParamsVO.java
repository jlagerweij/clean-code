package cleancode;

public class ManyParamsVO {
    public static void main(String[] args) {
        new ManyParamsVO().placeOrder("John", "Doe", "St. Albergue", "Paris", 99);
    }
    public void placeOrder(String fName, String lName, String city, String streetName, Integer streetNumber) {
    	if (fName == null || lName == null) throw new IllegalArgumentException();
    	
    	System.out.println("Some Logic for " + fName + " " + lName.toUpperCase());
    }
}

class AnotherClass {
    public void otherMethod(String firstName, String lastName, int x) {
    	if (firstName == null || lastName == null) throw new IllegalArgumentException();
    	
    	System.out.println("Another distant Logic");
    }
}

// over the hills and far away ...
class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (firstName == null || lastName == null) throw new IllegalArgumentException();
        // TODO think: is this sufficient enforcing ?
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
}

class PersonService {
    public void f(Person person) {
        String fullName = person.getFirstName() + " " + person.getLastName().toUpperCase();
        System.out.println(fullName);
    }
}