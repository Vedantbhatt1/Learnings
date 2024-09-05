import java.util.Scanner;

public class SumOfNNaturalNumbers{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sum=0,i=1;
        while(i<=num){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}