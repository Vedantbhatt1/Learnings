import java.util.Scanner;

public class IfElse{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;
        a=s.nextInt();
        b=s.nextInt();
        if(a>b){
            System.out.println("First number is greater");
        }
        else{
            System.out.println("Second number is greater");
        }
    }
}