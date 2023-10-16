package OOPs.Abstract_classes;

/**
 * AbstractClass- you can't create object from abstract class.
 */


public class AbstractClass {
    public static void main(String[] args) {
        Cat FirstCat = new Cat();
        FirstCat.makeNoice();
        FirstCat.printName("musi");
    }
}