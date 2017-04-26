/**
 * Created by 1 on 26.04.2017.
 */
public class GruzCar extends ElectricCar {
    private int MassOfFreightage;
    private int VolumeOfFreightage;

    public GruzCar(String Name, int Speed, int Mass, int NumOfPassengers, int NumOfWheels, int MassOfFreightage, int VolumeOfFreightage) {
        super(Name, Speed, Mass, NumOfPassengers, NumOfWheels);
        this.MassOfFreightage = MassOfFreightage;
        this.VolumeOfFreightage = VolumeOfFreightage;
    }
    @Override
    public String toString() {
        return "GruzCar {" +
                "Name: "  + getName() +"; Speed: " + getSpeed()+ "; Mass: " + getMass() +
                "; MassOfFreightage: "+ MassOfFreightage + "; VolumeOfFreightage: " + VolumeOfFreightage+
                "; NumOfPassengers: " + getNumOfPassengers() +"; NumOfWheels: " + getNumOfWheels() + ";}";
    }

    public int getMassOfFreightage() {
        return MassOfFreightage;
    }

    public void setMassOfFreightage(int massOfFreightage) {
        MassOfFreightage = massOfFreightage;
    }

    public int getVolumeOfFreightage() {
        return VolumeOfFreightage;
    }

    public void setVolumeOfFreightage(int volumeOfFreightage) {
        VolumeOfFreightage = volumeOfFreightage;
    }
}
