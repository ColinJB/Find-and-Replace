import org.junit.*;
import static org.junit.Assert.*;

public class FaRTest {

  @Test
  public void newArray_instantiatesCorrectly_Array() {
    FaR testFar = new FaR();
    assertEquals(true, testFar instanceof FaR);

  }

}
