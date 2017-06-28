package vehicle;

public class QuadBike extends Vehicle implements Drivable{

  private int engineCapacity;

  public QuadBike(int engineCapacity){
    super(15);
    setEngineCapacity(engineCapacity);
  }

  public int driveDistance(int distance){
    return 0;
  }

  public int getEngineCapacity(){
    return this.engineCapacity;
  }

  private void setEngineCapacity(int engineCapacity){
    if(engineCapacity >= 49 && engineCapacity <= 1000){
      this.engineCapacity = engineCapacity;
    }else{
      correctEngineCapacity(engineCapacity);
    }
  }

  private void correctEngineCapacity(int engineCapacity){
    if(engineCapacity < 49){
      this.engineCapacity = 49;
    }else{
      this.engineCapacity = 1000;
    }
  }

}
