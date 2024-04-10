public class WhileLoop {
    public static void main(String[] args) {
        int j=1;
        boolean isrReady=false;

        while(true){
            if(j>5){
                break;
            }
            System.out.println(j);
            j++;
        }
        int number=0;
        while(number<50){
            number+=5;
            if(number%25==0){
                continue;
            }
            System.out.print(number+"_");
        }

    }
}
