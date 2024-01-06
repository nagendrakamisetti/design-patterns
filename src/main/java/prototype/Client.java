package prototype;

public class Client {
    public static void main(String[] args) {
        Prototype original1 = new ConcretePrototype1();
        Prototype cloned1 = original1.clone(); // Creates a new instance by cloning

        Prototype original2 = new ConcretePrototype2();
        Prototype cloned2 = original2.clone(); // Creates a new instance by cloning
    }
}

