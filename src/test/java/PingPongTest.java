import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
public class PingPongTest {


  @Test
  public void isPingPong_forNumberNotDivisibleByThreeFiveAndFifthteen_number() {
    PingPong pingPong = new PingPong();
    ArrayList<String> expected = new ArrayList<String>();
    expected.add("1");
    expected.add("2");
    assertEquals(expected, pingPong.outputPingPong(2));
  }

  @Test
  public void isPingPong_forNumberDivisibleByThree_number() {
    PingPong pingPong = new PingPong();
    ArrayList<String> expected = new ArrayList<String>();
    expected.add("1");
    expected.add("2");
    expected.add("Ping");
    assertEquals(expected, pingPong.outputPingPong(3));
  }

  @Test
  public void isPingPong_forNumberDivisibleByFive_number() {
    PingPong pingPong = new PingPong();
    ArrayList<String> expected = new ArrayList<String>();
    expected.add("1");
    expected.add("2");
    expected.add("Ping");
    expected.add("4");
    expected.add("Pong");
    expected.add("Ping");
    expected.add("7");
    expected.add("8");
    expected.add("Ping");
    expected.add("Pong");

    assertEquals(expected, pingPong.outputPingPong(10));
  }

  @Test
  public void isPingPong_forNumberDivisibleByFifthteen_number() {
    PingPong pingPong = new PingPong();
    ArrayList<String> expected = new ArrayList<String>();
    expected.add("1");
    expected.add("2");
    expected.add("Ping");
    expected.add("4");
    expected.add("Pong");
    expected.add("Ping");
    expected.add("7");
    expected.add("8");
    expected.add("Ping");
    expected.add("Pong");
    expected.add("11");
    expected.add("Ping");
    expected.add("13");
    expected.add("14");
    expected.add("Ping-Pong");
    assertEquals(expected, pingPong.outputPingPong(15));
  }

}
