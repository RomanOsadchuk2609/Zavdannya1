/**
 * Created by 1 on 26.04.2017.
 */
public class IntercityBus extends Bus {
    private String FirstCity;
    private String LastCity;
    private final int NumOfFloors = 2;

    public IntercityBus(String Name, int Speed, int Mass, int NumOfPassengers, int NumOfWheels, String FirstCity, String LastCity) {
        super(Name, Speed, Mass, NumOfPassengers, NumOfWheels);
        this.FirstCity = FirstCity;
        this.LastCity = LastCity;
    }

    public String getFirstCity() {
        return FirstCity;
    }

    public void setFirstCity(String firstCity) {
        FirstCity = firstCity;
    }

    public String getLastCity() {
        return LastCity;
    }

    public void setLastCity(String lastCity) {
        LastCity = lastCity;
    }
    @Override
    public String toString() {
        return "IntercityBus {" +
                "Name: "  + getName() + "; FirstCity: " + FirstCity + "; LastCity: " + LastCity +
                "; Speed: " + getSpeed()+  "; Mass: " + getMass() + "; NumOfFloors: "+ NumOfFloors +
                "; NumOfPassengers: " + getNumOfPassengers() +  "; NumOfWheels: " + getNumOfWheels() + ";}";
    }
}
