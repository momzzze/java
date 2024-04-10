public class Main {
    public static void main(String[] args){
//        int value=3;
//        if(value==1){
//            System.out.println("Value was 1");
//        }else if(value==2){
//            System.out.println("Value was 2");
//        }else{
//            System.out.println("Was not 1 or 2");
//        }
//        int switchValue=3;
//        switch (switchValue){
//            case 1-> System.out.println("Value was 1");
//            case 2-> System.out.println("Value was 2");
//            default-> System.out.println("Was not 1 or 2");
//        }
//        String month="OCTOBER";
//        System.out.println(month+" is in the "+getQuarter(month)+" quarter");
//        char name='F';
//        System.out.println(getNATOName(name));
//        printDayOfWeek(0);
//        printDayOfWeek(1);
//        printDayOfWeek(2);
//        printDayOfWeek(3);
//        printDayOfWeek(4);
//        printDayOfWeek(5);
//        printDayOfWeek(6);
//        printDayOfWeek(7);

//        System.out.println(isLeapYear(10000));
//        System.out.println(isLeapYear(-1600));
//        System.out.println(isLeapYear(1600));
//        System.out.println(isLeapYear(2017));
//        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
    }

    public static String getQuarter(String month){
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {yield "1st";}
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3th";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> "bad";
        };
    }
    public static String getNATOName(char charName){

        return switch (charName){
            case 'A' -> "Able";
            case 'B' -> "Baker";
            case 'C' -> "Charlie";
            case 'D' -> "Dog";
            case 'E' -> "Easy";
            default -> "Letter "+charName + " was not found in the switch";
        };
    }

    public static void printDayOfWeek(int day){
        switch (day){
            case 1->System.out.println("Monday");
            case 2->System.out.println("Tuesday");
            case 3->System.out.println("Wednesday");
            case 4->System.out.println("Thursday");
            case 5->System.out.println("Friday");
            case 6->System.out.println("Saturday");
            case 0->System.out.println("Sunday");
            default -> System.out.println("Invalid Day");
        }
    }

    public static void printNumberInWord(int number){
        String numberInString=switch (number){
            case 0-> "ZERO";
            case 1-> "ONE";
            case 2-> "TWO";
            case 3-> "THREE";
            case 4-> "FOUR";
            case 5-> "FIVE";
            case 6-> "SIX";
            case 7-> "SEVEN";
            case 8-> "EIGHT";
            case 9-> "NINE";
            default -> "OTHER";
        };
        System.out.println(numberInString);
    }

    public static boolean isLeapYear(int year){
        if(year < 1 || year >= 9999){
            return false;
        }
        if((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))){
            return true;
        }
        return false;
    };

    public static int getDaysInMonth(int month,int year){
        if(month<1 || month>12){
            return -1;
        }
        if(year<0 || year>9999){
            return -1;
        }
            boolean isItLeap=isLeapYear(year);
            int days=switch (month){
                case 2-> isItLeap ? 29 :28;
                case 4-> 30;
                case 6-> 30;
                case 9-> 30;
                case 11->30;
                default -> 31;
            };
            return days;
    }
}
