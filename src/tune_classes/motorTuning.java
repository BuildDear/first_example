package tune_classes;

import interfaces.ITuning;
import main_classes.Car;

public class motorTuning implements ITuning
{
    @Override
    public void tuning()
    {
        int get = Car.getMaxSpeed();
        Car.setMaxSpeed(get + 100);
    }
}
