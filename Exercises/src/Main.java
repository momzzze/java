public class Main {
    public static void main(String[] args) {
//        long result = toMilesPerHour(-5.6);
//        System.out.println(result);
//        printConversion(95.75);
//-------------------------------------------------------------
//        printMegaBytesAndKiloBytes(5000);
//        boolean res = shouldWakeUp(true, 1);
//        boolean res1 = shouldWakeUp(false, 2);
//        boolean res2 = shouldWakeUp(true, 8);
//        boolean res3 = shouldWakeUp(true, -1);
//
//        System.out.println(res);
//        System.out.println(res1);
//        System.out.println(res2);
//        System.out.println(res3);
//------------------------------------------------------
//        boolean res = isLeapYear(-1600);
//        boolean res1 = isLeapYear(1600);
//        boolean res2 = isLeapYear(2017);
//        boolean res3 = isLeapYear(2000);
//        System.out.println(res);
//        System.out.println(res1);
//        System.out.println(res2);
//        System.out.println(res3);

//        boolean res = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
//        boolean res1 = areEqualByThreeDecimalPlaces(3.175, 3.176);
//        boolean res2 = areEqualByThreeDecimalPlaces(3.0, 3.0);
//        boolean res3 = areEqualByThreeDecimalPlaces(-3.123, 3.123);
//                System.out.println(res);
//                System.out.println(res1);
//                System.out.println(res2);
//                System.out.println(res3);

//        System.out.println(hasTeen(9, 99, 19));
//        System.out.println(hasTeen(23, 15, 42));
//        System.out.println(hasTeen(22, 23, 34));

        System.out.println(getDurationString(3945));  // this is the first test case
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(65, -45));
        System.out.println(getDurationString(65, 145));
    }

    public static void printPositiveNegativeOrZero(int number) {
        System.out.println((number == 0) ? "zero" : (number > 0) ? "positive" : "negative");
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        double cfc = 1.609;
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / cfc);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long result = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + result + " mi/h");
    }


    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int megaByteValue = 1024;
        int remainingKilobytes = kiloBytes % megaByteValue;
        int megaBytes = kiloBytes / megaByteValue;
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKilobytes + " KB");
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else {
            return barking && (hourOfDay < 8 || hourOfDay > 22);
        }

    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {
        double test = (int) (numberOne * 1000);
        double test1 = (int) (numberTwo * 1000);
        return test1 == test;
    }

    public static boolean hasEqualSum(int num1, int num2, int num3) {
        if (num1 + num2 == num3) {
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        if (isTeen(num1) || isTeen(num2) || isTeen(num3)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int num) {
        if (num >= 13 && num <= 19){
            return true;
        }
        return  false;
    }


    public  static String getDurationString(int seconds){
      if(seconds < 0) {
          return "Invalid data for seconds ("+ seconds+ "), must be positive integer value";
      }
          return getDurationString(seconds/60, seconds%60);

    }
    public  static String getDurationString(int minutes,int seconds){
        if(minutes < 0) {
            return "Invalid data for minutes ("+ seconds+ "), must be positive integer value";
        }
        if(seconds<=0||seconds>=59){
            return "Invalid data for seconds("+ seconds+"), must be between 0 and 59";
        }
        int hours=minutes/60;
        int remainingMinutes=minutes%60;
        int remainingSeconds=seconds%60;
        return hours+"h "+remainingMinutes+"m "+ remainingSeconds+"s";
    }
}
