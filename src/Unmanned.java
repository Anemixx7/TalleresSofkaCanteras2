public class Unmanned extends Spacecraft {
    private boolean active;

    public Unmanned(int push, int weight, String gas, int engines, int speedMax, boolean active) {
        super(push, weight, gas, engines, speedMax);
        this.active=active;
    }  
}
