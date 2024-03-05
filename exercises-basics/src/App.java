import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);

        int hours=Integer.parseInt(sc.nextLine());
        int minutes=Integer.parseInt(sc.nextLine());
        if((minutes+30)>=60){
            hours+=1;
            minutes=(minutes+30)-60;
        }
        else{
            minutes+=30;
        }
        System.out.printf("%02d:%02d",hours,minutes);
    }
}
