import java.util.Random;

public class Game {
  private String mAnswer;
  private String mLetter = "asdfgw";


  public String generateAnswer() {
    Random myRandomGenerator = new Random();
    Integer randomNumber = myRandomGenerator.nextInt(5);
    String[] randomWords = {"epicodus", "computer", "sign", "table", "light"};
    mAnswer = randomWords[randomNumber];
    return mAnswer;
  }

  public String letters(String letter) {
    mLetter += letter;
    return mLetter;
  }
  // public String getAnswer() {
  //   return mAnswer;
  // }

  // public String getLetter() {
  //   return mLetter;
  // }

  public boolean checkAnswer() {
    int total = 0;
    for (int i = 0; i < mAnswer.length(); i++){
      if(mLetter.indexOf(mAnswer.charAt(i)) == -1){
        total += 0;
      } else {
        total += 1;
      }
    }
    if (mAnswer.length() == total) {
      return false;
    } else {
      return true;
    }
  }



}
