import java.util.Scanner;
public class PlanesDemo 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner("System.in");
        System.out.println("You have a choice to fly either of 2 planes ('Airliner' or 'Fighter')");
        System.out.print("Enter plane type: ");
        String planeType = kb.nextLine();
        Planes plane;
        if(planeType.equals("Airliner"))
        {
            plane = new Airliner();
            plane.loading();
            plane.takeoff();
            plane.cruisingAltitude();
            plane.landing();
        }
        else if(planeType.equals("Fighter")) 
        {
            plane = new FighterJet();
            plane.loading();
            plane.takeoff();
            plane.cruisingAltitude();
            plane.landing();
        }
        else
        {
            System.out.println("invalid choice");
            System.exit(0);
        }
        kb.close();
    }
}
