public class DoWhileLoop {
    public static void main(String[] args) {
        int j=1;
        boolean isrReady=false;
        do{
            if(j>5){
                break;
            }
            System.out.println(j);
            j++;
            isrReady=(j>0);
        }while(isrReady);
    }
}
