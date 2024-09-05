import java.util.Scanner;

public class invertedNumber{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num =s.nextInt();
        int i =0;
        while(i<num){
            int j=num-i;
            while(j>0){
                System.out.print(i+1+"\t");
                j--;
            }
            System.out.println();
            i++;
        }
    }
}