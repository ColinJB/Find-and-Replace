import java.util.List;
import java.util.ArrayList;


public class FaR {
  String[] input = {};

  public String wordReplace(String phrase, String word, String replacementWord) {
    String lowPhrase = phrase.toLowerCase();
    String lowWord = word.toLowerCase();
    String lowReplacementWord = replacementWord.toLowerCase();
    String newPhrase = lowPhrase.replace(lowWord, lowReplacementWord);
    return newPhrase;
  }

}
