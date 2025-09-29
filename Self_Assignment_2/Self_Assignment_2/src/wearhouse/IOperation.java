package wearhouse;

import java.util.List;

public class IOperation {
    private String id;
    private String description;
    private double nominalTime;
    private List<AGV> resources;

    public IOperation(String id, String description, double nominalTime, List<AGV> resources) {
        this.id = id;
        this.description = description;
        this.nominalTime = nominalTime;
        this.resources = resources;
    }

    public double getDuration() {
        return nominalTime;
    }

    public List<AGV> getResources() {
        return resources;
    }

    public String getId() {
        return id;
    }
}
