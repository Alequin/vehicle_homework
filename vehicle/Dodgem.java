package vehicle;

public class Dodgem extends Vehicle{

  private int numberOfSeats;

  public Dodgem(int numberOfSeats){
    super(2);
    this.numberOfSeats = validateNumberOfSeats(numberOfSeats);
  }

  public int getNumberOfSeats(){
    return this.numberOfSeats;
  }

  private int validateNumberOfSeats(int numberOfSeats){
    if(numberOfSeats <= 0 || numberOfSeats > 3){
      numberOfSeats = getCorrectSeatCount(numberOfSeats);
    }
    return numberOfSeats;
  }

  private int getCorrectSeatCount(int numberOfSeats){
    if(numberOfSeats < 0){
      return 1;
    }else{
      return 3;
    }
  }

}
