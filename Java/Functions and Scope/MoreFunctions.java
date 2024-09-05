import java.util.Scanner;

public class MoreFunctions{
    public static double sum(int num1,int num2,double num3){
        return(num1+num2+num3);
    }
    public static void printEvenNumbers(int num1,int num2){
        if(num1%2!=0)num1++;
        for(int i =num1;i<=num2;i+=2){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        System.out.println(sum(num1,num2,10.5));
        Scanner s1 = new Scanner(System.in);
        int n1 = s1.nextInt();
        int n2 = s1.nextInt();
        printEvenNumbers(n1, n2);
    }
}