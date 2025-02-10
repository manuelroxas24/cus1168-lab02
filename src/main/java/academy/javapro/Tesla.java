package academy.javapro;

public class Tesla extends Vehicle implements Electric, Autonomous
{
    private boolean autopilotEnabled;
    private boolean charging;

    public Tesla(String model, int year)
    {
        super("Tesla", model, year);
        this.autopilotEnabled = false;
        this.charging = false;
    }

    // Vehicle methods
    @Override
    public void startEngine()
    {
        isRunning = true;
        System.out.println(GetMake() + " " +  GetModel() + " started");
    }
    @Override
    public void stopEngine()
    {
        isRunning = false;
        System.out.println(GetMake() + " " +  GetModel() + " stopped");
    }
    @Override
    public void accelerate()
    {
        if (isRunning)
        {
            System.out.println(GetMake() + " " +  GetModel() + " is accelerating...");
        }
        else
        {
            System.out.println(GetMake() + " " +  GetModel() + " is not accelerating.");
        }
    }
    @Override
    public void brake()
    {
        System.out.println(GetMake() + " " +  GetModel() + " is braking...");
    }

    // Autonomous methods
    @Override
    public void enableAutopilot()
    {
        autopilotEnabled = true;
        System.out.println("Autopilot enabled");
    }
    @Override
    public void disableAutopilot()
    {
        autopilotEnabled = false;
        System.out.println("Autopilot disabled");
    }
    @Override
    public String isAutopilotEnabled()
    {
        if (autopilotEnabled)
        {
            return "enabled";
        }
        else
        {
            return "disabled";
        }
    }

    // Electric methods
    @Override
    public void charge()
    {
        charging = true;
        System.out.println(GetMake() + " " +  GetModel() + " is now charging");
    }
    @Override
    public boolean isCharging()
    {
        return charging;
    }

    //Miscellaneous
    public void displayStatus()
    {
        System.out.println("Running: " + isRunning);
        System.out.println("Autopilot: " + autopilotEnabled);
        System.out.println("Charging: " + charging);
    }
    public void getInfo()
    {
        System.out.println(GetMake() + " " + GetModel() + " " + GetYear());
    }
}

