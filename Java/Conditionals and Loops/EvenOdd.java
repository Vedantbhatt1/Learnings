
import java.util.Scanner;


public class EvenOdd{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a =s.nextInt();
        if(a%2==0){
            System.out.println("Entered number is even");
        }
        else{
            System.out.println("Entered number is odd");
        }
    }
}