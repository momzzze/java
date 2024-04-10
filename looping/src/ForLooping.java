public class ForLooping {
    public static void main(String[] args){
//        for (int counter = 1; counter <= 5; counter++) {
//            System.out.println(counter);
//        }
//
//        for (double rate = 7.5; rate <= 10; rate+=0.25) {
//            if(rate>8.5){
//                break;
//            }
//            System.out.println("100.00 at "+rate+"% interest= $"+ calculateInterest(100,rate));
//        }
//        int countPrimerNumber=0;
//        for (int i = 0; i <1000; i++) {
//            if(isPrime(i)){
//                System.out.println("number "+i+" is a prime number");
//                countPrimerNumber++;
//            }
//
//            if(countPrimerNumber==3){
//                break;
//            }
//        }
//        System.out.println(countPrimerNumber);
//        System.out.println("0 is "+ (isPrime(0)?"":"NOT")+" a prime number");
//        System.out.println("1 is "+ (isPrime(1)?"":"NOT")+" a prime number");
//        System.out.println("2 is "+ (isPrime(2)?"":"NOT")+" a prime number");
//        System.out.println("3 is "+ (isPrime(3)?"":"NOT")+" a prime number");
//        System.out.println("8 is "+ (isPrime(8)?"":"NOT")+" a prime number");
//        System.out.println("17 is "+ (isPrime(17)?"":"NOT")+" a prime number");
//        int sum=0;
//        int count=0;
//        for (int i = 1; i <= 1000; i++) {
//            if(i%3==0 && i%5==0){
//                System.out.println("Number "+i);
//                sum+=i;
//                count++;
//                if(count==5){
//                    break;
//                }
//            }
//        }
//        System.out.println(sum);
        System.out.println(sumOdd(10, 10));
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }

    public static boolean isPrime(int wholeNumber){
        if(wholeNumber<=2){
            return (wholeNumber==2);
        }
        for (int divisor = 2; divisor <= wholeNumber/2; divisor++) {
            if(wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isOdd(int parameter){
        if(parameter<0){
            return false;
        }
        if(parameter%2==1){
            return true;
        }
        return false;
    }
    public static int sumOdd(int start, int end){
        if(start<0||end<0){
            return -1;
        }
        if(start>end){
            return -1;
        }
        int sum=0;
        for (int number = start; number <= end; number++) {
            if(isOdd(number)){
                sum+=number;
            }
        }
        return sum;
    }

}
