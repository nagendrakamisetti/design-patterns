package prototype.deepCloning;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Address implements Cloneable {
    private String city;
    private String country;

    // Constructor, getters, setters

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
