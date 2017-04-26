/**
 * Created by 1 on 26.04.2017.
 */
public class Bus extends Machine {
    private int Mass;
    private int NumOfPassengers;
    private int NumOfWheels;
    Bus (String Name, int Speed, int Mass, int NumOfPassengers, int NumOfWheels  ) {
        super(Name, Speed);
        this.Mass=Mass;
        this.NumOfPassengers=NumOfPassengers;
        this.NumOfWheels=NumOfWheels;
    }

    @Override
    public int getMass() {
        return Mass;
    }

    public void setMass(int mass) {
        Mass = mass;
    }

    @Override
    public int getNumOfPassengers() {
        return NumOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        NumOfPassengers = numOfPassengers;
    }

    @Override
    public int getNumOfWheels() {
        return NumOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        NumOfWheels = numOfWheels;
    }
}
