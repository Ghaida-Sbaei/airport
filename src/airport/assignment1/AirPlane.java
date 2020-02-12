package airport.assignment1;

public class AirPlane {
    private String planeId;
    private int maxNumbersPassenger;
    private int currentNumberPassenger;
    private boolean currentlyFlying;
    private double cruiseSpeed;


    public AirPlane(String planeId, int maxNumbersPassenger, int currentNumberPassenger, boolean currentlyFlying ){
        this.planeId=planeId;
        this.maxNumbersPassenger=maxNumbersPassenger;
        this.currentNumberPassenger=currentNumberPassenger;
        this.currentlyFlying=currentlyFlying;

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

    public boolean isCurrentlyFlying() {
        return currentlyFlying;
    }

    public void setCurrentlyFlying(boolean currentlyFlying) {
        this.currentlyFlying = currentlyFlying;
    }
public int loadPassenger(int numOfPassenger){
        this.currentNumberPassenger=numOfPassenger;
        return numOfPassenger;

}

public void takeOff(){
    System.out.println("The plane "+getPlaneId() +" takes off");

}
public void land(){
    System.out.println("The plane "+getPlaneId() +" lands");

}
public int unload(int numOfPassenger){
        this.currentNumberPassenger=numOfPassenger;
        return numOfPassenger;
    }


}
