package basics;
public class Recursion {
    public static void main(String[] args) {
      //  int n = 5;
      //  printNum(n);
        printNatural(1, 5, 0);

    }

    //To print n natural numbers
    public static void printNatural(int i ,int n ,int sum ) {
        if(i==n){
            sum += i;
            System.out.println(sum);
            return; 
        }
        sum += i;
        printNatural(i+1, n, sum);
    }

    public static void printNum(int n) {
        if(n ==0){    //Base CASE
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
}
