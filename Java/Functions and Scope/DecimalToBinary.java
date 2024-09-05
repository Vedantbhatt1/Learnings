import java.util.Scanner;

public class DecimalToBinary{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int res = 0;
        int fr =0;
        int pv = 1;
        while(num>0){
            int a = num%2;
            res +=a*pv;
            num/=2;
            pv*=10;
        }

        System.out.println(res);
    }
}