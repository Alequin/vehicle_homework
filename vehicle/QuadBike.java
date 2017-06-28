package vehicle;

public class QuadBike extends Vehicle implements Drivable{

  private int engineCapacity;

  public QuadBike(int engineCapacity){
    super(15);
    this.engineCapacity = validateEngineCapacity(engineCapacity);
  }

  public int driveDistance(int distance){
    return 0;
  }

  public int getEngineCapacity(){
    return this.engineCapacity;
  }

  private int validateEngineCapacity(int engineCapacity){
    if(engineCapacity < 49 || engineCapacity > 1000){
      engineCapacity = getCorrectEngineCapacity(engineCapacity);;
    }
    return engineCapacity;
  }

  private int getCorrectEngineCapacity(int engineCapacity){
    if(engineCapacity < 49){
      return 49;
    }else{
      return 1000;
    }
  }

}
