import org.junit.*;
import static org.junit.Assert.*;

public class FaRTest {

  @Test
  public void wordReplace_instantiatesCorrectly_Array() {
    FaR testFar = new FaR();
    assertEquals(true, testFar instanceof FaR);
  }

  @Test
  public void wordReplace_returnWord_Strings() {
    FaR testFar = new FaR();
    String[] expected = {"a word", "word", "new"};
    assertEquals(expected, testFar.wordReplace("","",""));
  }


}
