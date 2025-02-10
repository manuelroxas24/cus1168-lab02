package academy.javapro;

public class Main
{
    public static void main(String[] args)
    {

        Tesla tesla = new Tesla("Model S", 2024);

       //Initial Status
        System.out.println("Initial Status:");
        tesla.getInfo();
        tesla.displayStatus();

       //Basic Vehicle Functions
        System.out.println("\nTesting basic vehicle functions:");
        tesla.startEngine();
        tesla.accelerate();
        tesla.brake();

        //Autonomous Functions
        System.out.println("\nTesting autonomous features:");
        tesla.enableAutopilot();
        System.out.println("Autopilot is currently: " + tesla.isAutopilotEnabled());
        tesla.disableAutopilot();

        //Electric Features
        System.out.println("\nTesting electric features:");
        tesla.charge();
        System.out.println("Charging status: " + tesla.isCharging());

       //Final Status
        System.out.println("\nFinal car status:");
        tesla.stopEngine();
        tesla.displayStatus();
    }
}