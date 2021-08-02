package chapter4ExtensAndPolymorphism.optionA.task2;

import java.util.Objects;

public class Wheel {
    private int wheelId;

    public Wheel(int wheelId) {
        this.wheelId = wheelId;
    }

    public void changeWheel(Wheel wheelNew){
        this.setWheelId(wheelNew.wheelId);
        System.out.println(this.toString() + " has changed on new " + wheelNew.toString() + " .");
    }

    public int getWheelId() {
        return wheelId;
    }

    public void setWheelId(int wheelId) {
        this.wheelId = wheelId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return wheelId == wheel.wheelId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheelId);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "wheelId=" + wheelId +
                '}';
    }
}
