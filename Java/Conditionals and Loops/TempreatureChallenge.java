import java.util.Scanner;

public class TempreatureChallenge{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int F = s.nextInt();
        int W = s.nextInt();
        int E = s.nextInt();
        int C;
        System.out.println("\nF\tC");
        while(F<=E){
            C = (5*(F-32))/9;
            System.out.println(F+"\t"+C);
            F+=W;
        }
    }
}