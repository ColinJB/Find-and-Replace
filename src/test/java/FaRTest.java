import org.junit.*;
import static org.junit.Assert.*;

public class FaRTest {

  @Test
  public void wordReplace_instantiatesCorrectly_Array() {
    FaR testFar = new FaR();
    assertEquals(true, testFar instanceof FaR);
  }

  @Test
  public void wordReplace_replaceWord_Strings() {
    FaR testFar = new FaR();
    String expected = "a newer phrase";
    assertEquals(expected, testFar.wordReplace("a new phrase","new","newer"));
  }

  @Test
  public void wordReplace_replaceMultipleWords_Strings() {
    FaR testFar = new FaR();
    String expected = "a newer phrase newer";
    assertEquals(expected, testFar.wordReplace("a new phrase new","new","newer"));
  }


}
