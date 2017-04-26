/**
 * Created by 1 on 25.04.2017.
 */
public class Bike extends Machine {
    private int Mass;
    private int NumOfPassengers;
    private int NumOfWheels;

    Bike(String Name, int Speed, int Mass, int NumOfPassengers, int NumOfWheels  ) {
        super(Name, Speed);
        this.Mass=Mass;
        this.NumOfPassengers=NumOfPassengers;
        this.NumOfWheels=NumOfWheels;
    }


    @Override
    public int getMass() {
        return Mass;
    }

    @Override
    public int getNumOfWheels() {
        return NumOfWheels;
    }

    @Override
    public int getNumOfPassengers() {
        return NumOfPassengers;
    }

    public void setMass(int mass) {
        Mass = mass;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        NumOfPassengers = numOfPassengers;
    }

    public void setNumOfWheels(int numOfWheels) {
        NumOfWheels = numOfWheels;
    }

}
