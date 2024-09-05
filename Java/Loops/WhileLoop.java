import java.util.Scanner;

public class WhileLoop{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i = 1;
        while(i<=num){
            System.out.println("Hello");
            i++;
        }
    }
}