import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int rev=0;
        while(num>10){
            int r = num%10;
            rev=(10*rev)+r;
            num = num/10;
        }
        rev = (10*rev)+num;
        System.out.println(rev);
    }
}