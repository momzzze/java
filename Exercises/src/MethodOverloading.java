public class MethodOverloading {
    public static void main(String[] args) {
//        int calcScore=calculateScore("Tim",500);
//        System.out.println("New score is "+calcScore);
//        calculateScore(75);
//        calculateScore();

        System.out.println("5ft, 8in = "+convertToCentimeters(5,8)+ "cm");
        System.out.println("68in = "+convertToCentimeters(68)+ "cm");
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        return calculateScore("Anonymous",score);
    }
    public static int calculateScore() {
        System.out.println("No Player name, no player score");
        return 0;
    }

    public static double convertToCentimeters(int inch) {
        return inch*2.54;
    }
    public static double convertToCentimeters(int feet,int inch) {
//        return (convertToCentimeters((feet*12)+ inch));
        int feetToInches=feet*12;
        int totalInches=feetToInches+inch;
        double result=convertToCentimeters(totalInches);
        return  result;
    }
}
