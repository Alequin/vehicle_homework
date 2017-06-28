package driver;

import vehicle.*;

public class Driver{

  private String name;
  private Drivable ride;

  public Driver(String name, Drivable ride){
    this.name = name;
    this.ride = ride;
  }

  public Drivable getCurrentDrivable(){
    return this.ride;
  }

  public void setDrivableRide(Drivable ride){
    this.ride = ride;
  }
}
