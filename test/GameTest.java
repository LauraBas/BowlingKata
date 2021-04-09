import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameTest {

    @Test
    void shouldReturnPointsInRoll() {
        Game g = new Game();
        g.roll(4);
        Assertions.assertEquals(4, g.score());
    }

    @Test
    void shouldSumRollsPoints() {
        Game g = new Game();
        g.roll(6);
        g.roll(3);
        Assertions.assertEquals(9, g.score());
    }

    @Test
    void shouldSumNextFramePointsIfStrike() {
        Game g = new Game();
        g.roll(10);
        g.roll(5);
        g.roll(2);
        Assertions.assertEquals(24, g.score());
    }

    @Test
    void shouldSumNextRollPointsIfSpare() {
        Game g = new Game();
        g.roll(0);
        g.roll(10);
        g.roll(3);
        g.roll(3);
        g.roll(2);
        Assertions.assertEquals(21, g.score());
    }

    @Test
    void shouldSumNextRollPointsIfSpareInTwoRolls() {
        Game g = new Game();
        g.roll(4);
        g.roll(6);
        g.roll(2);
        g.roll(2);
        g.roll(2);
        Assertions.assertEquals(18, g.score());
    }

    @Test
    void shouldScoreMultipleStrikes() {
        Game g = new Game();
        g.roll(10);
        g.roll(10);
        g.roll(1);
        // 21 + 12 + 1 + 1

        g.roll(1);
        Assertions.assertEquals(35, g.score());
    }

    @Test
    void shouldScoreAPerfectGame() {
        Game g = new Game();
        rollMany(g, 12);
        Assertions.assertEquals(330, g.score());
    }

    private void rollMany(Game g, int times) {
        for (int i = 0; i < times; i++) {
            g.roll(10);
        }
    }
}