/*
 * This program demonstrates the comparison between ship types
 * and utilizes enumeration and the comparable interface.
 * 
 */

/**
 *
 * @author Sim
 */
  
public class SpaceShipDemo {
    
    public static void main (String [] args){
        
        System.out.println("Initializing...\n");
        
        Spaceship ship = new Spaceship();
        System.out.println(ship.toString());
        
        
        Spaceship shipSim = new Spaceship(ShipType.ConstructionVessel, "test", 
            "test");
        System.out.println(shipSim.toString());
        
        
        //testing less than classification
        System.out.println(shipSim.compareTo(ship) + ": The ship's "
            + "classification is less than otherShip's classification");
        
        
        //testing equal to classification
        Spaceship coffeeShip = new Spaceship();
        if(coffeeShip.equals(ship))
        {System.out.println(coffeeShip.compareTo(ship) + ": The ship's "
            + "classification is equal to otherShip's classification");
        }
 
        
        //testing greater than classification
        Spaceship latteShip = new Spaceship();
        System.out.println(latteShip.compareTo(shipSim) + ": The ship's "
            + "classification is greater than otherShip's classification");
        
        //comparing ConstructionVessel to ScienceVessel
        System.out.println(ShipType.ConstructionVessel.compareTo(ShipType.ScienceVessel));
        
        
    }
}
