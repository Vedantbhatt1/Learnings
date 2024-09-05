import java.util.Scanner;


public class BinaryToDecimal{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int pow = 0;
        double dec = 0;
        while(num>0){
            int a = num%10;
            if(a!=0){
            dec = Math.pow(2,pow)*a+dec;
            }
            pow++;
            num=num/10;
        }
        System.out.println(dec);
    }
}