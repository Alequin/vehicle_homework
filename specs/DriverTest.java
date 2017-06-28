import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import vehicle.*;
import driver.*;

public class DriverTest{

  Dodgem dodgem;
  QuadBike quadBike;
  Driver driver;

  @Before
  public void setup(){
    dodgem = new Dodgem(2);
    quadBike = new QuadBike(100);
    driver = new Driver("Mia", dodgem);
  }

  @Test
  public void canGetCurrentRide(){
    Drivable ride = driver.getCurrentDrivable();
    dodgem = (Dodgem) ride;
    assertEquals(2, dodgem.getNumberOfSeats());
  }

  @Test
  public void canSetCurrentRide(){
    driver.setDrivableRide(quadBike);
    Drivable ride = driver.getCurrentDrivable();
    quadBike = (QuadBike) ride;
    assertEquals(100, quadBike.getEngineCapacity());
  }

}
