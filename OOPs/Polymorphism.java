package OOPs;
 // Polymorphism
 //It has 2 types 
 // 1) compile type polymorphism or function overloading 
 // 2) runtime polymorphism or function overriding 


 //1) compile time polymorphism
class Students{
    String name;
    int age;
    public void details(String name){
        System.out.println(name);
    }
    public void details(int age){
        System.out.println(age);
    }

    public void details(String name, int age){
        System.out.println(name+ " "+age);
    }
}

/**
 * Polymorphism
 */
public class Polymorphism {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "utsav";
        s1.age = 22;
        s1.details(s1.name, s1.age);
    }
}