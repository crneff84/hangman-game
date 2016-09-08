import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    Game hangman = new Game();
    hangman.generateAnswer();
    String blankWord = hangman.blanks();
    while(hangman.checkAnswer()){
      String updatedBlankWord = hangman.getBlankWord();
      System.out.println(updatedBlankWord + " Enter a letter?");
      String letter = myConsole.readLine();
      hangman.letters(letter);
      hangman.updatedBlanks(letter);
    }
    String displayAnswer = hangman.getAnswer();
    String displayBlanks = hangman.getBlankWord();
    if (displayAnswer.equals(displayBlanks)) {
      System.out.println("Congratulations! Your word was " + displayAnswer + "!");
    }
  }
}
