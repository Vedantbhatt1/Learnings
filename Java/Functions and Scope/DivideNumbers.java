public class DivideNumbers{
    public static int divideNumbers(int num1, int num2){
        if(num2==0){
            return Integer.MIN_VALUE;
        }
        return(num1/num2);
    }
    public static void printDivideNumbers(int num1,int num2){
        if(num2==0){
            System.out.println("Dividing by zero is not possible");
            return;
        }
        System.out.println(num1/num2);
    }
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 0;
        System.out.println(divideNumbers(num1,num2));
        printDivideNumbers(num1, num2);
    }
}