public class MainChallenge {
    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("The high score is: " + highScore);
//
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//        System.out.println("The high score is: " + calculateScore(gameOver, score, levelCompleted, bonus));


        int position=calculateHighScorePosition(1500);
        displayHighScorePosition("Tim",position=position);
        int position2=calculateHighScorePosition(999);
        displayHighScorePosition("BoB",position=position2);
        int position3=calculateHighScorePosition(499);
        displayHighScorePosition("Percy",position=position3);
        int position4=calculateHighScorePosition(99);
        displayHighScorePosition("Gilbert",position=position4);
        int position5=calculateHighScorePosition(-1000);
        displayHighScorePosition("James",position=position5);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName+" managed to get into position "+position+" on the high score list");
    }

    public static int calculateHighScorePosition(int score) {
        int position=4;
        if (score >= 1000) {
            position= 1;
        } else if (score >= 500) {
            position= 2;
        } else if (score >= 100) {
            position= 3;
        }
        return position;
    }
}
