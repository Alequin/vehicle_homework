package vehicle;

public abstract class Vehicle implements Drivable{

  private int averageSpeed;

  public Vehicle(int averageSpeed){
    this.averageSpeed = averageSpeed;
  }

  public int getAverageSpeed(){
    return this.averageSpeed;
  }

  public int driveDistance(int distance){
    int time = distance / this.averageSpeed;
    return time;
  }

}
