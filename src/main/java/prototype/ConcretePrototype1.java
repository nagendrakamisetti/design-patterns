package prototype;

public class ConcretePrototype1 implements Prototype {
    @Override
    public Prototype clone() {
        return new ConcretePrototype1(); // Performs a shallow copy
    }
}
