package academy.javapro;

public abstract class Vehicle
{
    protected String make;
    protected String model;
    protected int year;
    protected boolean isRunning = false;

    //Public Abstract Class Blueprint
    public Vehicle(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.isRunning = false;
    }

    //Abstract methods
    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void accelerate();
    public abstract void brake();

    //Getters and Setters
    public String GetMake()
    {
        return make;
    }
    public String GetModel()
    {
        return model;
    }
    public int GetYear()
    {
        return year;
    }
    public boolean isRunning()
    {
        return isRunning;
    }
    public void SetMake()
    {
         this.make = make;
    }
    public void SetModel()
    {
         this.model = model;
    }
    public void SetYear()
    {
        this.year = year;
    }
    public void SetisRunning()
    {
        this.isRunning = isRunning;
    }
}
