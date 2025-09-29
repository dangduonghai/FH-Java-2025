package wearhouse;

public class AGV {
    private String id;
    private double batteryLoad;    
    private double consumption;    
    private double chargingTime;   
    private float maxSpeed;
    private float actSpeed;

    public AGV(String id, double batteryLoad, double consumption, double chargingTime, float maxSpeed, float actSpeed) {
        this.id = id;
        this.batteryLoad = batteryLoad;
        this.consumption = consumption;
        this.chargingTime = chargingTime;
        this.maxSpeed = maxSpeed;
        this.actSpeed = actSpeed;
    }

    public double getConsumption() {
        return consumption;
    }

    public String getId() {
        return id;
    }
}
