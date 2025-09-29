package wearhouse;

import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // AGVs
        AGV agv1 = new AGV("AGV1", 100, 2.5, 1, 10, 8);
        AGV agv2 = new AGV("AGV2", 100, 3.0, 1.2, 12, 9);
        AGV agv3 = new AGV("AGV3", 100, 2.0, 0.8, 9, 7);

        // Process 1
        IndustrialProcess process1 = new IndustrialProcess("Process1");
        process1.addOperation(new IOperation("Op1", "Pick items", 5, Arrays.asList(agv1, agv2)));
        process1.addOperation(new IOperation("Op2", "Transport items", 7, Arrays.asList(agv2)));

        // Process 2
        IndustrialProcess process2 = new IndustrialProcess("Process2");
        process2.addOperation(new IOperation("Op1", "Load materials", 6, Arrays.asList(agv3)));
        process2.addOperation(new IOperation("Op2", "Move materials", 4, Arrays.asList(agv1, agv3)));
        process2.addOperation(new IOperation("Op3", "Unload materials", 3, Arrays.asList(agv2)));

        // Process 3
        IndustrialProcess process3 = new IndustrialProcess("Process3");
        process3.addOperation(new IOperation("Op1", "Collect products", 8, Arrays.asList(agv1)));
        process3.addOperation(new IOperation("Op2", "Store products", 5, Arrays.asList(agv1, agv2, agv3)));

        // List of processes
        List<IndustrialProcess> processes = Arrays.asList(process1, process2, process3);

        // Simulation
        for (IndustrialProcess process : processes) {
            System.out.println("=== " + process.getId() + " ===");
            System.out.println("Total Duration: " + process.processDuration() + " time units");
            System.out.println("AGVs Required: " + process.processResources());
            System.out.println("Total Energy Consumption: " + process.processEnergy() + " units");
            System.out.println();
        }
    }
}
