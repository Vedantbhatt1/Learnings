import java.util.Scanner;


public class TriangleOfNumbers{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i = 1 ;
        while(i<=num){
            int j = 1;
            while(j<=(num-i)){
                System.out.print(" \t");
                j++;
            }
            int p =i;
            while(j<=num){
                System.out.print(p+"\t");
                p++;
                j++;
            }
            j=1;
            p=2*i-2;
            while(j<=(i-1)){
                System.out.print(p+"\t");
                p--;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}