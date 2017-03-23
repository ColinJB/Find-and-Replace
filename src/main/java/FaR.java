import java.util.List;
import java.util.ArrayList;


public class FaR {
  String[] input = {};

  public String wordReplace(String phrase, String word, String replacementWord) {
    phrase = "a new phrase";
    String newPhrase = phrase.replace(word, replacementWord);
    return newPhrase;
    // return {"a word", "word", "new"};
  }

}
