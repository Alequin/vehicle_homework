package vehicle;

public abstract class Vehicle{

  private int averageSpeed;

  public Vehicle(int averageSpeed){
    this.averageSpeed = averageSpeed;
  }

  public int getAverageSpeed(){
    return this.averageSpeed;
  }

}
