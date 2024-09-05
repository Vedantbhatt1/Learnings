import java.util.Scanner;

public class returnKeyword{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int div = 2;
        while(div<(num/2+1)){
            if(num%div==0){
                return;
            }
            div++;
        }
        System.out.println("Prime");
    }
}