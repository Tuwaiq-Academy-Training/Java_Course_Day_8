public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greet() {
        System.out.println("woooow");
    }
    public void greet(Dog dog) {
        System.out.println("hello small dog");
    }
    public void greet(BigDog bdog) {
        System.out.println("hello bigdog");
    }
}
