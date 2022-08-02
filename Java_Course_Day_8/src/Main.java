import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
Dog d1=new Dog("bobby");
Dog d2=new Dog("alice");
d1.greet();
d1.greet(d2);

BigDog bd1=new BigDog("hulk");
BigDog bd2=new BigDog("ironDog");
bd1.greet(d2);
bd1.greet(bd2);


    }
}