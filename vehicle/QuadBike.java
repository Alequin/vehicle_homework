package vehicle;

public class QuadBike extends Vehicle implements Drivable{

  private int engineCapacity;

  public QuadBike(int engineCapacity){
    super(15);
    this.engineCapacity = engineCapacity;
  }

  public int driveDistance(int distance){
    return 0;
  }

}
