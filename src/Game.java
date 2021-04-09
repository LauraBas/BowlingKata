public class Game {

    int[] rolls = new int[20];
    int currentRoll = 0;
    boolean firstRollOfFrame = true;

    void roll(int n) {
        rolls[currentRoll] = n;
        currentRoll++;
    }

    public int score() {
        int points = 0;
        for (int i = 0; i < 19; i++) {
            if (isAStrike(i)) {
                points += rolls[i + 1];
                points += rolls[i + 2];
                firstRollOfFrame = true;
            }

            if (isASpare(i)) {
                points += rolls[i + 1];
                firstRollOfFrame = !firstRollOfFrame;

            }
            if (!isAStrike(i) && !isASpare(i)) {
                firstRollOfFrame = !firstRollOfFrame;
            }
            points += rolls[i];
        }
        return points;
    }

    private boolean isASpare(int i) {
        return (i > 0 && !firstRollOfFrame && (rolls[i] + rolls[i - 1]) == 10);
    }

    private boolean isAStrike(int i) {
        return firstRollOfFrame && (rolls[i] == 10);
    }
}
