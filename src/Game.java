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
            } else if (isASpare(i)) {
                points += rolls[i + 2];
                firstRollOfFrame = !firstRollOfFrame;
            } else {
                firstRollOfFrame = !firstRollOfFrame;
            }
            points += rolls[i];
        }
        return points;
    }

    private boolean isASpare(int i) {
        return (firstRollOfFrame && (rolls[i] + rolls[i + 1]) == 10);
    }

    private boolean isAStrike(int i) {
        return firstRollOfFrame && (rolls[i] == 10);
    }
}
