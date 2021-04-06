public class Game {

    int[] rolls = new int[20];
    int i = 0;

    int roll(int n) {
        rolls[i] = n;
        i++;
        return score();
    }

    private int score() {
        int points = 0;
        for (int i = 0; i < rolls.length; i++) {
            if (rolls[i] == 10){
                points += rolls[i + 1];
                points += rolls[i + 2];

            }
            points += rolls[i];
        }
        return points;
    }
}
