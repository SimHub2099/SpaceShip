/*
 * This simple program demonstrates the application of the 
 * Comparable interface and overriding the toString and equals methods
 */

import java.util.Objects;

/**
 *
 * @author Sim
 *
 */
public class Spaceship implements Comparable<Spaceship>{ //implement interface

    /**
     * @param args the command line arguments
     */
    
    private ShipType classification;
    private String shipName; // "U.S.S. Default";
    private String captain; //  "Captain Krusty McGhee";
    
    public Spaceship(){
        this(ShipType.Warship ,"U.S.S. Default", "Captain Krusty McGhee");
    }// end no arg ctor
    
    
    public Spaceship(ShipType classification, String shipName, String captain) {

        this.classification = classification;
        this.shipName = shipName;
        this.captain = captain;

    }//end arg ctor

    public ShipType getClassification() {
        return classification;
    }//end getClassification
    
    public void setClassification(ShipType classification) {
        this.classification = classification;
    }//end setClassification
    
    public String getShipName() {
        return shipName;
    }//end getShipName
    
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }//end setShipName
    
    public String getCaptain() {
        return captain;
    }//end getCaptain
   
    public void setCaptain(String captain) {
        this.captain = captain;
    }//end setCaptain

    @Override
    public String toString() {
        String stringReturn = "The " + classification + ", " + shipName + " is a " +
                "sturdy vessel, under the leadership of " + captain;
        return stringReturn;
    }// end toString

    @Override
    public boolean equals(Object obj) {
        Spaceship equalsSpaceship = (Spaceship)obj;
        return (this.classification.equals(equalsSpaceship.classification));
    }//end equals

    public int compareTo(Spaceship otherShip){
        int returnCompareShip = classification.compareTo(otherShip.classification);
        return returnCompareShip;
    }//end compareTo method
}