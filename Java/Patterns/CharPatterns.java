import java.util.Scanner;

public class CharPatterns{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch = 'A';
        int i =1;
        int num =s.nextInt();


        // Pattern1

        // while(i<=num){
        //     int j = 0;
        //     while(j<num){
        //         System.out.print((char)(ch+j)+"\t");
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }


        // Pattern2

        i =0;
        while(i<num){
            int j =0;
            while(j<num){
                System.out.print((char)(ch+j+i)+"\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}