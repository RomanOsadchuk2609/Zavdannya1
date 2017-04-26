/**
 * Created by 1 on 25.04.2017.
 */
public class OrdinaryBike extends Bike{
    private String Type;
    public OrdinaryBike(String Name, int Speed, int Mass, int NumOfPassengers, int NumOfWheels, String type) {
        super(Name, Speed, Mass, NumOfPassengers, NumOfWheels);
        this.Type = type;
    }

    @Override
    public String toString() {
        return "OrdinaryBike {" +
                "Type: " + Type + "; Name: "  + getName() + "; Speed: " + getSpeed()+
                "; Mass: " + getMass() + "; NumOfPassengers: " + getNumOfPassengers() +
                "; NumOfWheels: " + getNumOfWheels() +";}";
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}
