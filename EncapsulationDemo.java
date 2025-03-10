class Person {
    private String name; // Private variable

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String newName) {
        this.name = newName;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alice");
        System.out.println("Person's Name: " + person.getName());
    }
}
