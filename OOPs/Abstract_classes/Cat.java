package OOPs.Abstract_classes;

public class Cat extends Animal implements AnimalStuff{
    int age;
    int name;
     public void makeNoice(){
        System.out.println("meoww");
    }
    public void poop() {
        System.out.println("pooooppppp");
    }


}


