import static org.junit.Assert.*;
import org.junit.before;
import org.junit.test;
import vehicle.Dogem;

public class DogemTest{

  Dogem dogem;

  @before
  public void setup(){
    dogem = new Dogem(2);
  }

  @Test
  public void canGetNumberOfSeats(){
    assertEquals(2, dogem.getNumberOfSeats());
  }

  @Test
  public void canCorrectNumberOfSeats(){
    dogem = new Dogem(-1);
    assertEquals(1, dogem.getNumberOfSeats());
    dogem = new Dogem(4);
    assertEquals(3, dogem.getNumberOfSeats());
  }
}
