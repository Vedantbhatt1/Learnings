import java.util.Scanner;

public class CodeAlphaPattern{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i =0;
        char c ='A';
        while(i<num){
            int j =0;
            while(j<=i){
                System.out.print((char)(c+i)+"\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}