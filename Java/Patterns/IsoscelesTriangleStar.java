import java.util.Scanner;

public class IsoscelesTriangleStar{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i =1;
        while(i<=n){
            int j =1;
            while(j<=(n-i)){
                System.out.print(" \t");
                j++;
            }
            j = 1;
            while(j<=(2*i-1)){
                System.out.print("*\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}