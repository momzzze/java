public class LoopExercises {
    public static void main(String[] args) {
//        for (int i = 5; i <=20 ; i++) {
//            if(isEvenNumber(i)){
//                System.out.println(i);
//            }
//        }
//        int i=5;
//        int count=0;
//        while(i<=20){
//            if(isEvenNumber(i)){
//                count++;
//                System.out.println(i);
//            }
//            if(count==5){
//                break;
//            }
//            i++;
//        }
//        System.out.println("Total numbers found "+count);

//
//        System.out.println(sumDigits(1234));
//        System.out.println(sumDigits(-125));
//        System.out.println(sumDigits(4));
//        System.out.println(sumDigits(32123));
//       System.out.println( isPalindrome(12321));

//        System.out.println( sumFirstAndLastDigit(252));   //4
//        System.out.println( sumFirstAndLastDigit(257));   //9
//        System.out.println( sumFirstAndLastDigit(0));     //0
//        System.out.println( sumFirstAndLastDigit(5));     //10
//        System.out.println( sumFirstAndLastDigit(-10));    //-1

//        System.out.println( getEvenDigitSum(123456789));     //20
//        System.out.println( getEvenDigitSum(252));     //4
//        System.out.println( getEvenDigitSum(-22));    //-1

//        System.out.println(hasSharedDigit(12, 23));  // true
//        System.out.println(hasSharedDigit(99, 9));  // true
//        System.out.println(hasSharedDigit(15, 55));  // true

//        System.out.println(hasSameLastDigit(41, 22,71));  // true
//        System.out.println(hasSameLastDigit(23, 32,42));  // true
//        System.out.println(hasSameLastDigit(9, 99,99));  // false

//        printFactors(6);  // → should print 1 2 3 6
//
//        printFactors(32); // → should print 1 2 4 8 16 32
//
//        printFactors(10); // → should print 1 2 5 10
//
//        printFactors(-1); // → should print "Invalid Value"
//
//        System.out.println(getGreatestCommonDivisor(25, 15));  // should return 5 since both can be divided by 5 without a remainder
//        System.out.println(getGreatestCommonDivisor(12, 30));  // should return 6 since both can be divided by 6 without a remainder
//        System.out.println(getGreatestCommonDivisor(9, 18));   // should return -1 since the first parameter is < 10
//        System.out.println(getGreatestCommonDivisor(81, 153)); // should return 9 since both can be divided by 9 without a remainder
//        System.out.println(getGreatestCommonDivisor(132, 1573)); // should return 9 since both can be divided by 9 without a remainder

//        System.out.println(isPerfectNumber(6)); // should return true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6
//        System.out.println(isPerfectNumber(28)); // should return true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28
//        System.out.println(isPerfectNumber(5)); // should return false since its only proper divisor is 1 and the sum is 1 not 5
//        System.out.println(isPerfectNumber(-1)); // should return false since the number is < 1

//        System.out.println(getDigitCount(0)); //should return 1 since there is only 1 digit
//        System.out.println(getDigitCount(123)); //should return 3
//        System.out.println(getDigitCount(-12)); //should return -1 since the parameter is negative
//        System.out.println(getDigitCount(5200)); // return 4 since there are 4 digits in the number
//
//        System.out.println(reverse(-121)); // should  return -121
//        System.out.println(reverse(1212)); // should return  2121
//        System.out.println(reverse(1234)); // should return 4321
//       System.out.println(reverse(0)); // should return 1
//       System.out.println(reverse(1000)); // should return 1

//        numberToWords(123); // should print "One Two Three".
//        numberToWords(1010); // should print "One Zero One Zero".
//       numberToWords(1000); // should print "One Zero Zero Zero".
//        numberToWords(-12); // should print "Invalid Value" since the parameter is negative.
//        numberToWords(0); // should print "Invalid Value" since the parameter is negative.
//        numberToWords(1000); // should print "Invalid Value" since the parameter is negative.

    }
    public static boolean isEvenNumber(int num){
        return num%2==0;
    }    public static int sumDigits(int number){
        if(number<0){
            return -1;
        }
        int sum=0;
        int iteratedNumber=number;
        while(iteratedNumber>0){
            sum+=iteratedNumber%10;
            iteratedNumber=iteratedNumber/10;
        }
        return sum;
    }    public static boolean isPalindrome(int num){
        int reversedNum=0;
        int remainingNumbers=num;
        int count=0;
        String palNumber=Integer.toString(num);;
        String palNumberReveresed="";
        while(remainingNumbers>0){
            palNumberReveresed=palNumberReveresed+(remainingNumbers%10);
            remainingNumbers=remainingNumbers/10;
            count++;
        }
        count=count/2;
        for (int i = 0; i < count; i++) {
            if(palNumber.charAt(i)!=palNumberReveresed.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }

        int count=0;
        int firstNum=0;
        int lastNumber=0;
        int incrementedNumber=number;
        while (incrementedNumber>0){
            if(count==0){
                lastNumber=incrementedNumber%10;
            }
            count++;
            firstNum=incrementedNumber%10;
            incrementedNumber=incrementedNumber/10;
        }
        return firstNum+lastNumber;
    }
    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int iteratedNumber=number;
        int result=0;
        while (iteratedNumber>0){
            if((iteratedNumber%10)%2==0){
                result+=iteratedNumber%10;
            }
            iteratedNumber=iteratedNumber/10;
        }
        return result;
    }
    public static boolean hasSharedDigit(int num1,int num2){
        if((num1<=10 || num1>=99) && (num2<=10 || num2>99)){
            return false;
        }
        int iteratedNum1=num1;
        int iteratedNum2=num2;

        while (iteratedNum1>0){
            while (iteratedNum2>0){
                if(iteratedNum1%10==iteratedNum2%10){
                    return true;
                }
                iteratedNum2=iteratedNum2/10;
            }
            iteratedNum1=iteratedNum1/10;
            iteratedNum2=num2;
        }
        return false;
    }
    public static boolean hasSameLastDigit(int num1,int num2,int num3){
        if(!isValid(num1)|| !isValid(num2)||!isValid(num3)){
           return false;
        }
        if(num1%10==num2%10|| num2%10==num3%10 || num1%10==num3%10){
            return true;
        }

        return false;
    }    public static boolean isValid(int num){
        return num >= 10 && num <= 1000;
    }
    public static void printFactors(int num){
        if(num<1){
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= num; i++) {
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10 || second<10){
            return -1;
        }
        int iterator=first>second? first: second;
        int biggest=0;
        for (int i = 1; i < iterator; i++) {
            if(first%i==0 && second%i==0){
                if (biggest<i){
                    biggest=i;
                }
            }
        }
        return biggest;
    }
    public static boolean isPerfectNumber(int num){
        if(num<1){
            return false;
        }
        int sum=0;
        int iteratedNum=num;
        for (int i = 1; i < num; i++) {
            if(num%i==0){
                sum+=i;
            }
        }
        return sum==num;
    }
    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }
        int count=0;
        int iteratedNumber=number;
        while (iteratedNumber>0){
            count++;
            iteratedNumber=iteratedNumber/10;
        }
        if(count==0){
            count=1;
        }
        return count;
    }
    public static int reverse(int number){
        if(number==0){
            return 0;
        }
        String reversedNumber="";
        if(number<0){
            reversedNumber="-";
        }
        int iteratedNumber=Math.abs(number);

        while (iteratedNumber>0){
            int digit=iteratedNumber%10;
            reversedNumber=reversedNumber + Integer.toString(digit);
            iteratedNumber=iteratedNumber/10;
        }
        return Integer.parseInt(reversedNumber);
    }
    public static void numberToWords(int number) {
        int zeroCount=getDigitCount(number);
        if (number == 0) {
            System.out.println("Zero");
            return;
        }
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reversedNumber = reverse(number);
        int counter=0;
        while (reversedNumber > 0) {
            int digit = reversedNumber % 10;
            switch (digit) {
                case 1 -> System.out.print("One ");
                case 2 -> System.out.print("Two ");
                case 3 -> System.out.print("Three ");
                case 4 -> System.out.print("Four ");
                case 5 -> System.out.print("Five ");
                case 6 -> System.out.print("Six ");
                case 7 -> System.out.print("Seven ");
                case 8 -> System.out.print("Eight ");
                case 9 -> System.out.print("Nine ");
                default -> System.out.print("Zero ");
            }
            reversedNumber /= 10;
            counter++;
        }

        for (int i = 0; i < zeroCount-counter; i++) {
            System.out.print("Zero");
            System.out.print(" ");
        }

        System.out.println();
    }


}
