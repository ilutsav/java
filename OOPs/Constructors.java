package OOPs;

class Student{
    String name;
    int age;
    public void display(){
        System.out.println(name + " "+ age);
    }
    Student(){}  // non parameterized constructors // if we don't create this then it is created by default by java
}

class Teacher{
    String name;
    int salary;
    Teacher(String name, int salary){       // parameterized constructor
        this.name = name ;
        this.salary = salary;
    }
}

class Monitor{
    String name;
    int age;
    public void info(){
        System.out.println(name+" "+age);
    }
    Monitor(Student s1Student){       // copy constructor
        this.name = s1Student.name;
        this.age = s1Student.age;
    }

}

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Utsav";
        s1.age = 22;
        Monitor m1 = new Monitor(s1);
        m1.info();

    }
}