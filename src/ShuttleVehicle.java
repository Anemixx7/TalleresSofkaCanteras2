public class ShuttleVehicle extends Spacecraft {
    private int transportCapacity;
    private int height;
    
    public ShuttleVehicle(int push, int weight, String gas, int engines, int speedMax, int transportCapacity, int height) {
        super(push, weight, gas, engines, speedMax);
        this.transportCapacity=transportCapacity;
        this.height=height;
    }
}
