import java.util.Scanner;

public class IsoscelesTriangle{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i =1;
        while(i<=num){
            int j =1;
            while(j<=(num-i)){
                System.out.print(" \t");
                j++;
            }
            int p =1;
            while(j<=num){
                System.out.print(p+"\t");
                j++;
                p++;
            }
            j =i-1;
            while(j>0){
                System.out.print(j+"\t");
                j--;
            }
            System.out.println();
            i++;
        }
    }
}