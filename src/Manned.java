public class Manned extends Spacecraft {
    private int staffCapacity;
    private int orbitDistance;

    public Manned(int push, int weight, String gas, int engines, int speedMax, int staffCapacity, int orbitDistance) {
        super(push, weight, gas, engines, speedMax);
        this.staffCapacity=staffCapacity;
        this.orbitDistance=orbitDistance;
    }
}
