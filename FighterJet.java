public class FighterJet extends Planes
{
    public FighterJet(){}

    public void loading()
    {
        System.out.println("boarding 1 pilot");
    }

    public void takeoff()
    {
        System.out.println("Lockheed Martin F22 taking of East from "+ 
            "Edwards Air Force Base");
    }

    public void cruisingAltitude()
    {
        System.out.println("Aircraft reaches Mach 1.82 (1,220 mph) at 50,000 feet");
    }

    public void landing()
    {
        System.out.println("Landing at Edwards Air Force Base");
    }
}
