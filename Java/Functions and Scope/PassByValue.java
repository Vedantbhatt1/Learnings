public class PassByValue{
    public static void c(int n){
        n++;
        System.out.println("Inside c "+n);
    }
    public static void b(int n){
        n++;
        c(n);
        System.out.println("Inside b "+n);
    }
    public static void a(int n){
        n++;
        b(n);
        System.out.println("Inside a "+n);
    }
    public static void main(String[] args) {
        int n = 10;
        a(n);
        System.out.println("Inside main " +n);
    }
}