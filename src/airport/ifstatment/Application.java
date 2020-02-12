package airport.ifstatment;


  public class Application {

        public static void main(String[] args) {

            AirPlane plane1=new AirPlane("ABC123",100,43,true);
            AirPlane plane2=new AirPlane("DDD888",90,23,true);

            plane1.load(55);
            plane1.takeOff();
            plane1.land();
            plane2.setCurrentlyFlying(false);
            plane2.isCurrentlyFlying();
            plane1.unload(55);

            System.out.println("==================================================================================================");
            plane2.load(100);
            plane2.load(85);
            plane2.takeOff();
            plane2.land();
            plane2.setCurrentlyFlying(false);
            plane2.isCurrentlyFlying();
            plane2.unload(85);


        }

    }


