package prototype;

public class ConcretePrototype2 implements Prototype {
    @Override
    public Prototype clone() {
        return new ConcretePrototype2(); // Performs a shallow copy
    }
}
