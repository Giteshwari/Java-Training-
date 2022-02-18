package JavaSession23_Enhancements;

enum TrafficLight
{
    RED("STOP"), GREEN("GO"), YELLOW("DRIVE VERY SLOW");
    String action;
    public String getAction()
    {
        return this.action;
    }
    TrafficLight(String action)
    {
        this.action = action;
    }
}
public class EnumDemo
{
    public static void main(String[] args)
    {

        TrafficLight[] signals = TrafficLight.values();

        for (TrafficLight signal : signals)
        {
            System.out.println( signal.name()+ " MEANS " + signal.getAction() );
        }
    }
}
/*
output:

RED MEANS STOP
GREEN MEANS GO
YELLOW MEANS DRIVE VERY SLOW
 */