package rapair_classes;

import interfaces.IRepair;
import main_classes.Car;

public class motorRepair implements IRepair
{
    @Override
    public void repair()
    {
        Car.setMotorWareRate(100);
    }
}
