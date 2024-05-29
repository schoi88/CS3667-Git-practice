/*
 * Airliner class
 * 
 * Extends Planes for use as an example Airliner flight. 
 */
public class Airliner extends Planes 
{
    public Airliner(){}

    public void loading()
    {
        System.out.println("boarding 2 pilots, 1 flight engineer, "+ 
            "10 flight attendents, and 600 passengers plus luggage");
    }

    public void takeoff()
    {
        System.out.println("Airbus A380 taking off West from "+ 
            "John F. Kennedy International Airport");
    }

    public void cruisingAltitude()
    {
        System.out.println("Aircraft reaches Mach 0.85 (561 mph) at 35,000 feet");
    }

    public void landing()
    {
        System.out.println("Landing at Los Angeles Internation Airport");
    }
}
