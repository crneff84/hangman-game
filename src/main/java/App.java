import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    Game hangman = new Game();
    hangman.generateAnswer();
    // System.out.println(hangman.getAnswer());
    while(hangman.checkAnswer()){
      System.out.println("Enter a letter?");
      String letter = myConsole.readLine();
      hangman.letters(letter);
    }
  }
}
