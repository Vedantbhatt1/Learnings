import java.util.Scanner;

public class APterm{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int count = 1,i=1;
        while(count<=num){
            if((3*i+2)%4==0){
                i++;
            }
            else{
                System.out.print(3*i+2+" ");
                count++;
                i++;
            }
        }
    }
}