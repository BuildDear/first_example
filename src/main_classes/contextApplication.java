package main_classes;

import interfaces.IRepair;
import interfaces.ITuning;

public class contextApplication
{
    private IRepair repairType;
    private ITuning tuningType;

    public contextApplication() {}

    public void setRepairStrategy( IRepair repairType )
    {
        this.repairType = repairType;
    }
    public void setTuningStrategy( ITuning tuningType )
    {
        this.tuningType = tuningType;
    }

    public void executeStrategy()
    {
        repairType.repair();
        tuningType.tuning();
    }
}
