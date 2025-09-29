package wearhouse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IndustrialProcess {
    private String id;
    private List<IOperation> operations;

    public IndustrialProcess(String id) {
        this.id = id;
        this.operations = new ArrayList<>();
    }

    public void addOperation(IOperation op) {
        operations.add(op);
    }

    public double processDuration() {
        double total = 0;
        for (IOperation op : operations) {
            total += op.getDuration();
        }
        return total;
    }

    public int processResources() {
        Set<String> uniqueAGV = new HashSet<>();
        for (IOperation op : operations) {
            for (AGV agv : op.getResources()) {
                uniqueAGV.add(agv.getId());
            }
        }
        return uniqueAGV.size();
    }

    public double processEnergy() {
        double energy = 0;
        for (IOperation op : operations) {
            for (AGV agv : op.getResources()) {
                energy += agv.getConsumption() * op.getDuration();
            }
        }
        return energy;
    }

    public String getId() {
        return id;
    }
}
