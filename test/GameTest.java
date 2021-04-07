import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameTest {

   @Test
    void shouldReturnPointsInRoll() {
       Game g = new Game();
       Assertions.assertEquals(4 ,g.roll(4));
   }

   @Test
   void shouldSumRollsPoints() {
       Game g = new Game();
       g.roll(6);
       Assertions.assertEquals(9 ,g.roll(3));
   }

   @Test
    void shouldSumNextFramePointsIfStrike() {
       Game g = new Game();
       g.roll(10);
       g.roll(5);
       Assertions.assertEquals(24 ,g.roll(2));
   }

   @Test
    void shouldSumNextRollPointsIfSpare() {
       Game g = new Game();
       g.roll(0);
       g.roll(10);
       g.roll(3);
       Assertions.assertEquals(18, g.roll(2));
   }

   @Test
    void shouldSumNextRollPointsIfSpareInTwoRolls() {
       Game g = new Game();
       g.roll(4);
       g.roll(6);
       g.roll(2);
       Assertions.assertEquals(16, g.roll(2));
   }
}