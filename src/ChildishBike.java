/**
 * Created by 1 on 25.04.2017.
 */
public class ChildishBike extends Bike {
    private int MaxAgeOfPassenger;

    public int getMaxAgeOfPassenger() {
        return MaxAgeOfPassenger;
    }

    public void setMaxAgeOfPassenger(int maxAgeOfPassenger) {
        MaxAgeOfPassenger = maxAgeOfPassenger;
    }

    public ChildishBike(String Name, int Speed, int Mass, int NumOfPassengers, int NumOfWheels, int maxAgeOfPassenger) {
        super(Name, Speed, Mass, NumOfPassengers, NumOfWheels);
        this.MaxAgeOfPassenger = maxAgeOfPassenger;
    }
    @Override
    public String toString() {
        return "ChildishBike {" +
                "Name: "  + getName() + "; Speed: " + getSpeed()+
                "; Mass: " + getMass() + "; NumOfPassengers: " + getNumOfPassengers() +
                "; NumOfWheels: " + getNumOfWheels() + "; MaxAgeOfPassenger: " + MaxAgeOfPassenger + ";}";
    }
}
