import org.junit.*;
import static org.junit.Assert.*;

public class FaRTest {

  @Test
  public void wordReplace_instantiatesCorrectly_Array() {
    FaR testFar = new FaR();
    assertEquals(true, testFar instanceof FaR);
  }

  @Test
  public void wordReplace_returnNewPhrase_Strings() {
    FaR testFar = new FaR();
    String expected = "a newer phrase";
    assertEquals(expected, testFar.wordReplace("a new phrase","new","newer"));
  }


}
