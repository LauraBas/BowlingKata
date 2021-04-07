public class Game {

    int[] rolls = new int[20];
    int currentRoll = 0;

    int roll(int n) {
        rolls[currentRoll] = n;
        currentRoll++;
        return score();
    }

    private int score() {
        int points = 0;
        for (int i = 0; i < rolls.length; i++) {
            if ((rolls[i] == 10) && (i % 2 == 0)) {
                points += rolls[i + 1];
                points += rolls[i + 2];
            }

            if ((i % 2 == 0) && (rolls[i] + rolls[i + 1]) == 10) {
                points += rolls[i + 2];
            }
            points += rolls[i];
        }
        return points;
    }
}
