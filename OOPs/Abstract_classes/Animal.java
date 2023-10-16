package OOPs.Abstract_classes;

public abstract class Animal {
    int age;
    String name;
    public abstract void makeNoice();
    public void printName(String name){
        System.out.println("My name is "+name);
    }

}
