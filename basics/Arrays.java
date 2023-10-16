package basics;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
//        simpleExample();
  //      searchInArray();
  twoDArrays();
    }

    public static void simpleExample(){
                System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];

        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }
    }

    public static void searchInArray() {
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter the elements of array");
        int elements[] = new int[size];
        for(int i=0;i<size;i++){
            elements[i] = sc.nextInt();
        }
        System.out.println("Enter the element to find its index");
        int x = sc.nextInt();
        for(int i=0;i<size;i++){
            if (elements[i]==x) {
                System.out.println("Element found at"+ i);                
            }
            else{
                System.out.println("Number not found");
                return;
            }
        }
    }


    // 2D ARRAYS
    public static void twoDArrays() {
    int numbers[][] = new int[2][3];
    Scanner sc = new Scanner(System.in);
    for(int i =0; i<2;i++){
        for(int j =0;j<3;j++){
            numbers[i][j] = sc.nextInt(); 
        }
    }
    System.out.println("Enter elements are : ");
    for(int i=0;i<2;i++){
        for(int j = 0; j<3;j++){
            System.out.print(numbers[i][j]+" ");
        }
        System.out.println();
    }
}
}


