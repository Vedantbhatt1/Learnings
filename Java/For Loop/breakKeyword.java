public class breakKeyword{
    public static void main(String[] args) {
        for(int i =1;i<=5;i++){
            for(int j =1;j<=5;j++){
                if(i+1==j){
                    break;
                }
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}