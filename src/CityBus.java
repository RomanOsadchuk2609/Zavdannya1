/**
 * Created by 1 on 26.04.2017.
 */
public class CityBus extends Bus {
    private int BusNumber;

    public CityBus(String Name, int Speed, int Mass, int NumOfPassengers, int NumOfWheels, int BusNumber) {
        super(Name, Speed, Mass, NumOfPassengers, NumOfWheels);
        this.BusNumber = BusNumber;
    }

    public int getBusNumber() {
        return BusNumber;
    }

    public void setBusNumber(int busNumber) {
        BusNumber = busNumber;
    }
    @Override
    public String toString() {
        return "CityBus {" +
                "Name: "  + getName() + "; BusNumber: " + BusNumber + "; Speed: " + getSpeed()+
                "; Mass: " + getMass() + "; NumOfPassengers: " + getNumOfPassengers() +
                "; NumOfWheels: " + getNumOfWheels() + ";}";
    }
}
