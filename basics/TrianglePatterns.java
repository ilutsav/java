package basics;
public class TrianglePatterns {
    public static void main(String[] args){
        //SOLID RECTANGLE
        // for(int i =1; i<=3; i++){
        //     for(int j=1;j<=3;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        //HOLLOW RECTANGLE
        // int n =4;
        // int m=5;
        // for(int i = 1;i<=n;i++){
        //     for(int j=1 ; j<=m;j++){
        //         if(i==1 || i==n || j==1 || j==m){ // n is number of rows and m is number of columns
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        //HALF PYRAMID
        // for(int i=0;i<=5;i++){
        //     for(int j=0;j<i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //INVERTED HALF PYRAMID
        // for(int i=5;i>=0;i--){
        //     for(int j=0;j<i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //
        //ROTATED HALF PYRAMID
        // for(int i = 1; i<=5;i++){
        //     for(int j=1;j<=5-i;j++){
        //         System.out.print(" ");//for space
        //     }

        //     for(int j =1;j<=i;j++){
        //         System.out.print("*");//for star
        //     }
        //     System.out.println();
        // } 

        //HALF PYRAMID WITH NUMBER
        // for(int i =1; i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // INVERTED HALF PYRAMID WITH NUMBER
        // int n=4;
        // for(int i =0;i<=n;i++){
        //     for(int j=1;j<=n-i+1;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // FLOYED'S TRIANGLE
        // int number =1;
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();

        // }

        // 0-1 TRIANGLE
        // for(int i =1; i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         int sum = i+j;
        //         if(sum % 2 ==0){
        //             System.out.print("1");
        //         }
        //         else{
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println();
        // }

        //PYRAMID
        for(int i =1;i<=5;i++){
            for(int j=1;j<=5-i;j++){   // for space
                System.out.print(" ");
            }

            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
