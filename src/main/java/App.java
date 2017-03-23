import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console userConsole = System.console();
    System.out.println("Welcome to Find and Replace! Please enter a sentence.");
    String sentence = userConsole.readLine();
    System.out.println("Please choose a word from that sentence which you would like to replace.");
    String word = userConsole.readLine();
    System.out.println("Please choose a word that you would like to replace the previous word with.");
    String replacementWord = userConsole.readLine();
    FaR far = new FaR();
    String newPhrase = far.wordReplace(sentence, word, replacementWord);
    System.out.println("Your new phrase is: " + newPhrase);

  }
}
