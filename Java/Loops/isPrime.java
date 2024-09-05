import java.util.Scanner;

public class isPrime{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int div = 2;
        boolean isPrime = true;
        while(div<(num/2+1)){
            if(num%div==0){
                isPrime = false;
            }
            div++;
        }
        if(isPrime==true)System.out.println("Prime");
        else System.out.println("Composite");
    }
}