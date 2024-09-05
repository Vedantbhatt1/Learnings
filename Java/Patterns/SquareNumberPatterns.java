import java.util.Scanner;

public class SquareNumberPatterns{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i =1;

        // Pattern1

        // while(i<=num){
        //     int j =1;
        //     while(j<=num){
        //         System.out.print(i+"\t");
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }

        // Pattern2

        // while(i<num){
        //     int j =1;
        //     while(j<=num){
        //         System.out.print(j+"\t");
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }

        // Pattern3

        while(i<=num){
            int j =num;
            while(j>0){
                System.out.print(j+"\t");
                j--;
            }
            System.out.println();
            i++;
        }

    }

}