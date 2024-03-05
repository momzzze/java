import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);

        int number=Integer.parseInt(scanner.nextLine());

        switch(number%2==0?2:1){
            case 1:
                System.out.println("odd");
                break;
            case 2:
                System.out.println("even");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
