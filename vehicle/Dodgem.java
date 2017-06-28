package vehicle;

public class Dodgem extends Vehicle implements Drivable{

  private int numberOfSeats;

  public Dodgem(int numberOfSeats){
    super(2);
    setNumberOfSeats(numberOfSeats);
  }

  public int driveDistance(int distance){
    return 0;
  }

  public int getNumberOfSeats(){
    return this.numberOfSeats;
  }

  private void setNumberOfSeats(int numberOfSeats){
    if(numberOfSeats > 0 && numberOfSeats <= 3){
      this.numberOfSeats = numberOfSeats;
    }else{
      setCorrectSeatCount(numberOfSeats);
    }
  }

  private void setCorrectSeatCount(int numberOfSeats){
    if(numberOfSeats < 0){
      this.numberOfSeats = 1;
    }else{
      this.numberOfSeats = 3;
    }
  }

}
