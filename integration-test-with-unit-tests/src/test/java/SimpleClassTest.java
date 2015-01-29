import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleClassTest {

  @Test
  public void testGetText() throws Exception {
    SimpleClass simpleClass = new SimpleClass();
    assertEquals("Должно совпасть", "Это текст", simpleClass.getText() );
  }
}