import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import vehicle.Dodgem;

public class DodgemTest{

  Dodgem dodgem;

  @Before
  public void setup(){
    dodgem = new Dodgem(2);
  }

  @Test
  public void canGetNumberOfSeats(){
    assertEquals(2, dodgem.getNumberOfSeats());
  }

  @Test
  public void canCorrectNumberOfSeats(){
    dodgem = new Dodgem(-1);
    assertEquals(1, dodgem.getNumberOfSeats());
    dodgem = new Dodgem(4);
    assertEquals(3, dodgem.getNumberOfSeats());
  }

  @Test
  public void getDriveDistance(){
    int expected = 10;
    int result = dodgem.driveDistance(20);
    assertEquals(expected, result);
  }
}
