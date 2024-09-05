import java.util.Scanner;

public class invertedTriangle{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i =num;
        while(i>0){
            int j =i;
            while(j>0){
                System.out.print("*\t");
                j--;

            }
            System.out.println();
            i--;
        }
    }
}