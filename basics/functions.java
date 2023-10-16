package basics;
import java.util.Scanner;
public class functions {
    public static void main(String[] args) {
 //       add(args);
 factorial();

    }
//     public static void add(String[] args) {
//         System.out.println("Enter numbers to add");
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = sumCalculate(a,b);
//         System.out.println("Sum is "+sum+".");
        
//     }

//  public static int sumCalculate(int a , int b){
//     return a+b;
//     }

    public static void factorial() {
        System.out.println("enter number to find out its factorial");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact =1 ;
        for(int i=n ;i>=1;i--){
            fact = fact*i;
        }
        System.out.println(fact);

    }
}
