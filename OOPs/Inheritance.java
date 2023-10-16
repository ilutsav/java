package OOPs;

/**
 * Inheritance
 */
//there are 4 types 
//single inheritance
//Hierarchical inheritance
//multilevel inheritance
//hybrid inheritance

//this is single inheritance
class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
 }
 class Triangle extends Shape {
    public void area(int l,int h) {
        System.out.println(1.0/2*l*h);
    }  
 }
 
public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(2,4);
        t1.area();
    }
    
}