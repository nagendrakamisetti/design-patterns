package prototype.deepCloning;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Person implements Cloneable {
    private String name;
    private Address address;

    // Constructor, getters, setters

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person clonedPerson = (Person) super.clone();
        clonedPerson.address = (Address) address.clone(); // Performing deep copy for Address
        return clonedPerson;
    }
}

