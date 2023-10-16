package OOPs;

class Student{
    String name;
    static String school;       // can be excessed from any where
}

public class AboutStatic {
    public static void main(String[] args) {
        Student.school = "MBM";          // for eg we called here without creating object
        Student s1 = new Student();
        s1.name = "Utsav";
        System.out.println("Name of student is "+ s1.name+"\nSchoool is "+s1.school );
    }
}
