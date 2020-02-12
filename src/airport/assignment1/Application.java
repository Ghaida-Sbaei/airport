package airport.assignment1;

import airport.assignment1.AirPlane;

public class Application {
    public static void main(String[] args) {
        System.out.println("Test");
        AirPlane plane1=new AirPlane("ABC123",100,43,true);
        AirPlane plane2=new AirPlane("DDD888",90,23,true);

        System.out.println("THe plane "+plane1.getPlaneId()+" has "+plane1.getCurrentNumberPassenger()+ " passengers");
        System.out.println( "THe plane "+plane2.getPlaneId() +" has " + plane2.getCurrentNumberPassenger()+" passengers");

        System.out.println("The airplane "+plane1.getPlaneId()  +" loads "+ plane1.loadPassenger(44) + " passenger ");
        plane1.takeOff();
        plane1.land();
        System.out.println("The airplane "+plane1.getPlaneId()  +" unloads "+ plane1.unload(44)+ " passenger ");
        System.out.println("==================================================================================================");

        System.out.println("The airplane "+plane2.getPlaneId()  +" loads "+ plane2.loadPassenger(44) + " passenger ");
        plane2.takeOff();
        plane2.land();
        System.out.println("The airplane "+plane2.getPlaneId()  +" unloads "+ plane2.unload(44)+ " passenger ");


    }

}
