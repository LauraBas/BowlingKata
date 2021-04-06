import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameTest {

   @Test
    void shouldReturnPointsInRoll() {
       Game g = new Game();
       assert(g.roll(4) == 4);
   }

   @Test
   void shouldSumRollsPoints() {
       Game g = new Game();
       assert(g.roll(6) == 6);
       assert(g.roll(3) == 9);
   }

   @Test
    void shouldSumNextFramePointsIfStrike() {
       Game g = new Game();
       g.roll(10);
       g.roll(5);
       Assertions.assertEquals(24 ,g.roll(2));
   }

}