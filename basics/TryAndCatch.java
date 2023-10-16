package basics;
public class TryAndCatch {
    public static void main(String[] args) {
        
        try {
            int[] numbers = {3,2,5};
            System.out.println(numbers[7]);
        } catch (Exception e) {
            System.out.println("exception occured!!!");
        }
    }
}
