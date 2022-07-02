public abstract class Spacecraft {
    protected int push;
    protected int weight;
    protected String gas;
    protected int engines;
    protected int speedMax;
    protected int currentSpeed;

    public Spacecraft(int push, int weight, String gas, int engines, int speedMax) {
        this.push = push;
        this.weight = weight;
        this.gas = gas;
        this.engines = engines;
        this.speedMax = speedMax;
        this.currentSpeed = 0;
    }

    protected void SpeedUp(int speed) {
        if (this.currentSpeed + speed > speedMax) {
            this.currentSpeed = speedMax;
        } else {
            this.currentSpeed += speed;
        }
    }

    protected void Decelerate(int speed) {
        if (this.currentSpeed - speed < 0) {
            this.currentSpeed = 0;
        } else {
            this.currentSpeed -= speed;
        }
    }
}
