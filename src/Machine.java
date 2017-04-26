/**
 * Created by 1 on 25.04.2017.
 */
abstract public class Machine implements Run  {
    final int MAX_SPEED = 200;
    final int MIN_SPEED = 0;
    final int MIN_NUM_OF_PASSENGERS = 0;
    final int MAX_NUM_OF_PASSENGERS = 100;
    private String Name;
    private int Speed;
    Machine(String Name, int Speed)    {
        this.Name=Name;
        this.Speed=Speed;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public int getSpeed() {
        return Speed;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

}
