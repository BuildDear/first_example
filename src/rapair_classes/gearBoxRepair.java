package rapair_classes;

import interfaces.IRepair;
import main_classes.Car;

public class gearBoxRepair implements IRepair
{
    @Override
    public void repair()
    {
        Car.setGearBoxWareRate(100);
    }
}
