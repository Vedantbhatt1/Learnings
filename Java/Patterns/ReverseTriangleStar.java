import java.util.Scanner;

public class ReverseTriangleStar{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i = 1;
        while(i<=num){
            int j =1;
            while(j<=num-i){
                System.out.print(" \t");
                j++;
            }
            while(j<=num){
                System.out.print("*\t");
                j++;
            }
            System.out.println();
            i++;

        }
    }
}