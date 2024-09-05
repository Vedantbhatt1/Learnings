import java.util.Scanner;

public class SquareRoot{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt(),i=1;
        while(Math.pow(i, 2)<=num){
            i++;
        }
        System.out.println(i-1);
    }
}