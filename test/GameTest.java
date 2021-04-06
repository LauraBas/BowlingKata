import org.junit.jupiter.api.Test;

class GameTest {

   @Test
    void shouldReturnPointsInRoll() {
       Game g = new Game();
       assert (g.roll(4) == 4);
   }

   @Test
   void shouldSumRollsPoints() {
       Game g = new Game();
       assert (g.roll(6) == 6);
       assert (g.roll(3) == 9);
   }

}