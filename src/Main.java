/**
 * Created by 1 on 25.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Bike childish = new ChildishBike("childish1", 10 , 5, 1, 4, 6 );
        System.out.println(childish+"\n");
        Bike ordinary = new OrdinaryBike("ordinary1", 35, 10, 1, 2, "sport" );
        System.out.println(ordinary+"\n");
        Bus bus1 = new CityBus("bus1", 40, 35, 50, 6, 3);
        System.out.println(bus1+"\n");
        Bus bus2 = new IntercityBus("bus2", 100, 50, 75, 8, "Chermivtsi", "Kyiv");
        System.out.println(bus2+"\n");
        ElectricCar trolleybus1 = new Trolleybus("troleybus1", 30, 45, 60, 10,1,  "Holovna St.", "Heroiv Maydanu St." );
        System.out.println(trolleybus1+"\n");
        ElectricCar gruzcar = new GruzCar("Gazel`", 70, 30, 2, 6, 1000, 10);
        System.out.println(gruzcar+"\n");
    }
}
