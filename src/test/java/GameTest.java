import org.junit.*;
import static org.junit.Assert.*;

public class GameTest {

  @Test
  public void newGame_instantiatesCorrectly() {
    Game testGame = new Game("answer");
    assertEquals(true, testGame instanceof Game);
  }

  @Test
  public void newGame_getsAnswer_test() {
    Game testGame = new Game("answer");
    assertEquals("answer", testGame.getAnswer());
  }

  @Test
  public void newGame_getsLetter_test() {
    Game testGame = new Game("answer");
    assertEquals("asdfgw", testGame.getLetter());
  }

  @Test
  public void newGame_checkAnswer_false() {
    Game testGame = new Game("answer");
    assertEquals(false, testGame.checkAnswer());
  }

  @Test
  public void newGame_checkAnswer_false() {
    Game testGame = new Game("answer");
    assertEquals(false, testGame.checkAnswer());
  }
}
