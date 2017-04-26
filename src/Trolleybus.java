/**
 * Created by 1 on 26.04.2017.
 */
public class Trolleybus extends ElectricCar {
    int Number;
    private String FirstStop;
    private String LastStop;

    public Trolleybus(String Name, int Speed, int Mass, int NumOfPassengers, int NumOfWheels,int Number, String FirstStop, String LastStop) {
        super(Name, Speed, Mass, NumOfPassengers, NumOfWheels);
        this.FirstStop = FirstStop;
        this.LastStop = LastStop;
        this.Number = Number;
    }
    @Override
    public String toString() {
        return "Trolleybus {" +
                "Name: "  + getName() + "; Number: " + Number + "; FirstStop: " + FirstStop +"; Last Stop: "+ LastStop+
                ";Speed: " + getSpeed()+ "; Mass: " + getMass() + "; NumOfPassengers: " + getNumOfPassengers() +
                "; NumOfWheels: " + getNumOfWheels() + ";}";
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getFirstStop() {
        return FirstStop;
    }

    public void setFirstStop(String firstStop) {
        FirstStop = firstStop;
    }

    public String getLastStop() {
        return LastStop;
    }

    public void setLastStop(String secondStop) {
        LastStop = secondStop;
    }
}
