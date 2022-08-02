public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greet() {
        System.out.println("wow wow");
    }

    public void greet(Dog another) {
        System.out.println("greeting other dog");
    }

}
