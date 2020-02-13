package airport.arrayLoop;

public class AirPLane {

        private String planeId;
        private int maxNumbersPassenger;
        private int currentNumberPassenger;
        private boolean currentlyFlying;
        private double cruiseSpeed;
        private int stillRoom;

        public AirPLane(String planeId, int maxNumbersPassenger, int currentNumberPassenger, boolean currentlyFlying) {
            this.planeId = planeId;
            this.maxNumbersPassenger = maxNumbersPassenger;
            this.currentNumberPassenger = currentNumberPassenger;
            this.currentlyFlying = currentlyFlying;

        }

        public String getPlaneId() {
            return planeId;
        }

        public void setPlaneId(String planeId) {
            this.planeId = planeId;
        }

        public int getMaxNumbersPassenger() {
            return maxNumbersPassenger;
        }

        public void setMaxNumbersPassenger(int maxNumbersPassenger) {
            this.maxNumbersPassenger = maxNumbersPassenger;
        }

        public int getCurrentNumberPassenger() {
            return currentNumberPassenger;
        }

        public void setCurrentNumberPassenger(int currentNumberPassenger) {
            this.currentNumberPassenger = currentNumberPassenger;
        }



        public void setCurrentlyFlying(boolean currentlyFlying) {
            this.currentlyFlying = currentlyFlying;

        }

        public int load(int currentNumberPassenger) {
            this.currentNumberPassenger = currentNumberPassenger;
            if(currentlyFlying == false) {
                if (currentNumberPassenger < maxNumbersPassenger) {
                    System.out.println("The Plane " + planeId + " loads " + getCurrentNumberPassenger() + " passengers , and ready to take off");
                } else
                    System.out.println("The plane " + planeId + " dose not have enough seats because the max is " + getMaxNumbersPassenger());
            }return currentNumberPassenger;
        }

        public void takeOff() {
            if (currentlyFlying = true) {
                System.out.println(" The plane " + planeId + " already flies ,it cannot take off");
            }
            System.out.println("The plane " + getPlaneId() + " takes off");
        }

        public void land() {
            if (currentlyFlying = true) {
                System.out.println("The plane " + getPlaneId() + " rises");
            }


        }

        public void unload(int numOfPassenger) {
            this.currentNumberPassenger = numOfPassenger;
            if (currentlyFlying = true) {
                System.out.println("The plane " + getPlaneId() + " discharges " + numOfPassenger + " passengers ");
            }
        }

    public boolean isCurrentlyFlying() {

        if (currentlyFlying == false) {
            stillRoom= maxNumbersPassenger - currentNumberPassenger;
            System.out.println("The plane "+planeId + " requested is not flying , still room for " + stillRoom + " passenger");
        }
        else{
            System.out.println("The plane "+ planeId+" is flying ");
        }
        return currentlyFlying;
    }
    }





