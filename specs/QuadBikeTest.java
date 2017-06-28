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
    assertEquals(100, quadBike.getEngineCapacity());
  }

  @Test
  public void canCorrectEngineCapacity(){
    quadBike = new QuadBike(48);
    assertEquals(49, quadBike.getEngineCapacity());
    quadBike = new QuadBike(1001);
    assertEquals(1000, quadBike.getEngineCapacity());
  }

  @Test
  public void getAverageSpeed(){
    int expected = 10;
    int result = quadBike.driveDistance(150);
    assertEquals(expected, result);
  }
}
