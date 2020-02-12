package airport.arrayLoop;

import airport.ifstatment.AirPlane;

public class Application {
    public static void main(String[] args) {

        AirPLane plane1 = new AirPLane("ABC123",100,43,true);
        AirPLane plane2 = new AirPLane("DDD888",90,85,true);
        AirPLane plane3 = new AirPLane("ODL345",120,110,false);

        AirPort schipol = new AirPort();
        schipol.aadPlane(plane1);
        schipol.aadPlane(plane2);
        schipol.aadPlane(plane3);
        System.out.println("The airport "+schipol.getName() +" has : ");
        schipol.printPlane();

    }


}
