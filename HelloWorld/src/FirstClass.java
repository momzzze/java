public class FirstClass {
    public static void main(String[] args) {
        double firstValue=20.00d;
        double secondValue=80.00d;
        double result=(firstValue+secondValue)*100.00d;
        boolean isValTrue=(result%40.00d)==0.00;
        System.out.println(isValTrue);
        if (!isValTrue){
            System.out.printf("got some remainder: %f",result%40.00d);
        }
        System.out.println(result);
    }
}
