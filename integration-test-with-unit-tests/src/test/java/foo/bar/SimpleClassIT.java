package foo.bar;

import foo.bar.SimpleClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Это класс производящий интеграционное тестирование
 *
 * @author Sergey.Titkov
 * @version 001.00
 * @since 001.00
 */
public class SimpleClassIT {
  @Test
  public void testGetText() throws Exception {
    SimpleClass simpleClass = new SimpleClass();
    assertEquals("Должно совпасть", "Это текст", simpleClass.getText() );
  }
}
