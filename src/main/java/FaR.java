import java.util.List;
import java.util.ArrayList;


public class FaR {
  String[] input = {};

  public String wordReplace(String phrase, String word, String replacementWord) {
    String newPhrase = phrase.replace(word, replacementWord);
    return newPhrase;
  }

}
