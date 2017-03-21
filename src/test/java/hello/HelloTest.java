
package hello;


import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTest {

  @Test
  public void add() {
    assertThat(1 + 1, is(2));
  }

}
