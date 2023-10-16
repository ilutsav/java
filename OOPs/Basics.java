package OOPs;

class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println("Your name is "+this.name);
        System.out.println("Your age is: "+this.age);
    }

}


public class Basics {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Utsav";
       s1.age = 22;
        s1.printInfo();

        Student s2 = new Student();
        s2.name ="Shambhav";
        s2.age= 12;
        s2.printInfo();
        
    }
}
