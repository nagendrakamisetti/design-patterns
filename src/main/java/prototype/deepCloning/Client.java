package prototype.deepCloning;

public class Client {
    public static void main(String[] args) {
        try {
            Address originalAddress = new Address("City", "Country");
            Person originalPerson = new Person("John", originalAddress);

            Person clonedPerson = (Person) originalPerson.clone();

            // Modifying the cloned object's address to demonstrate deep cloning
            clonedPerson.getAddress().setCity("New City");

            // Output to show that original and cloned objects have separate addresses
            System.out.println(originalPerson.getAddress().getCity()); // Output: City
            System.out.println(clonedPerson.getAddress().getCity()); // Output: New City

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

