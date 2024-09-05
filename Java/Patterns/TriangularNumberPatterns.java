import java.util.Scanner;

public class TriangularNumberPatterns{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i =1;

        // Pattern1

        // while(i<=num){
        //     int j =1;
        //     while(j<=i){
        //         System.out.print(j+"\t");
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }

        // Pattern2

        // while(i<num){
        //     int j =0;
        //     while(j<i){
        //         System.out.print((j+i)+"\t");
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }

        // Pattern3
        int x =1;
        while(i<=num){
            int j =1;
            while(j<=i){
                System.out.print(x+"\t");
                j++;
                x++;
            }
            System.out.println();
            i++;
        }
    }
}