import java.util.Scanner;

public class DiamondOfStars{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int n1 = (num+1)/2;
        int n2 = num-n1,i=1;
        while(i<=n1){
            int j =1;
            while(j<=(n1-i)){
                System.out.print(" \t");
                j++;
            }
            j=1;
            while(j<=(2*i-1)){
                System.out.print("*\t");
                j++;
            }
            System.out.println();
            i++;
        }
        i=n2;
        while(i>0){
            int j =1;
            while(j<=(n2-i+1)){
                System.out.print(" \t");
                j++;
            }
            j=1;
            while(j<=(2*i-1)){
                System.out.print("*\t");
                j++;
            }
            System.out.println();
            i--;
        }
    }

}