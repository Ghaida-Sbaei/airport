package airport.arrayLoop;

import java.util.ArrayList;

public class AirPort {
    private String name="Schipol";

    public AirPort(){

    }

    ArrayList<AirPLane> airCrafts= new ArrayList<AirPLane>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<AirPLane> getAirCrafts() {
        return airCrafts;
    }

    public void setAirCrafts(ArrayList<AirPLane> airCrafts) {
        this.airCrafts = airCrafts;
    }

    public void aadPlane(AirPLane airPlane){
        airCrafts.add(airPlane);

    }
    public void printPlane(){
        for (AirPLane airPLane : airCrafts) {
            System.out.println("\n * " + airPLane.getPlaneId() + " has current number of Passenger  " + airPLane.getCurrentNumberPassenger() + " @ max number is :  " + airPLane.getMaxNumbersPassenger() +" & Now is : " +airPLane.isCurrentlyFlying());
        }
    }




}
