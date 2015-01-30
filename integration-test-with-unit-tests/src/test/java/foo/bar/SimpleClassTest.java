package foo.bar;

import foo.bar.SimpleClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Это класс производящий модульное тестирование
 */
public class SimpleClassTest {

  @Test
  public void testGetText() throws Exception {
    SimpleClass simpleClass = new SimpleClass();
    assertEquals("Должно совпасть", "Это текст", simpleClass.getText() );
  }
}