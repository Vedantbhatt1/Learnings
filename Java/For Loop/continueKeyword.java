public class continueKeyword{
    public static void main(String[] args) {
        int i =1;
        while(i <=5){
            if(i==4){
                continue;
            }
            i++;
            System.out.println(i);
        }
    }
}