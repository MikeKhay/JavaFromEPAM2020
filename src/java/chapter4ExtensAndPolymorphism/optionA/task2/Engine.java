package chapter4ExtensAndPolymorphism.optionA.task2;

import java.util.Objects;

public class Engine {
    private int engineId;

    public Engine(int engineId) {
        this.engineId = engineId;
    }

    public void methodRefuel(){
        System.out.println("Car is refuel.");
    }

    public int getEngineId() {
        return engineId;
    }

    public void setEngineId(int engineId) {
        this.engineId = engineId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!( o instanceof Engine )) return false;
        Engine engine = (Engine) o;
        return getEngineId() == engine.getEngineId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEngineId());
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineId=" + engineId +
                '}';
    }
}
