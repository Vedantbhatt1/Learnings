import java.util.Scanner;

public class ReverseNumberPattern{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i =1;
        while(i<=num){
            int j =1;
            while(j<=num-i){
                System.out.print(" \t");
                j++;
            }
            j=1;
            while(j<=(num-(num-i))){
                System.out.print(j+"\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}