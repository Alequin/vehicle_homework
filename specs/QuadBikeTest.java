import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import vehicle.QuadBike;

public class QuadBikeTest{

  QuadBike quadBike;

  @Before
  public void setup(){
    quadBike = new QuadBike(100);
  }

  @Test
  public void canGetEngineCapacity(){
    assertEquals(100, quadBike.getNumberOfSeats());
  }

  @Test
  public void canCorrectEngineCapacity(){
    quadBike = new QuadBike(48);
    assertEquals(49, quadBike.getNumberOfSeats());
    quadBike = new QuadBike(1001);
    assertEquals(1000, quadBike.getNumberOfSeats());
  }
}
