package chapter4ExtensAndPolymorphism.optionA.task2;

import java.util.Objects;

public class Car {
    private String markCar;
    private Engine engine;
    private Wheel wheelFrontLeft;
    private Wheel wheelFrontRight;
    private Wheel wheelBackLeft;
    private Wheel wheelBackRight;

    public Car(String markCar, Engine engine, Wheel wheelFrontLeft, Wheel wheelFrontRight, Wheel wheelBackLeft, Wheel wheelBackRight) {
        this.markCar = markCar;
        this.engine = engine;
        this.wheelFrontLeft = wheelFrontLeft;
        this.wheelFrontRight = wheelFrontRight;
        this.wheelBackLeft = wheelBackLeft;
        this.wheelBackRight = wheelBackRight;
    }

    public void methodGo(){
        System.out.println("Car is going.");
    }

    public void methodPrintMarkCar(){
        System.out.println("Mark car is " + markCar);
    }

    public String getMarkCar() {
        return markCar;
    }

    public void setMarkCar(String markCar) {
        this.markCar = markCar;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheelFrontLeft() {
        return wheelFrontLeft;
    }

    public void setWheelFrontLeft(Wheel wheelFrontLeft) {
        this.wheelFrontLeft = wheelFrontLeft;
    }

    public Wheel getWheelFrontRight() {
        return wheelFrontRight;
    }

    public void setWheelFrontRight(Wheel wheelFrontRight) {
        this.wheelFrontRight = wheelFrontRight;
    }

    public Wheel getWheelBackLeft() {
        return wheelBackLeft;
    }

    public void setWheelBackLeft(Wheel wheelBackLeft) {
        this.wheelBackLeft = wheelBackLeft;
    }

    public Wheel getWheelBackRight() {
        return wheelBackRight;
    }

    public void setWheelBackRight(Wheel wheelBackRight) {
        this.wheelBackRight = wheelBackRight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!( o instanceof Car )) return false;
        Car car = (Car) o;
        return Objects.equals(markCar, car.markCar) &&
                Objects.equals(engine, car.engine) &&
                Objects.equals(wheelFrontLeft, car.wheelFrontLeft) &&
                Objects.equals(wheelFrontRight, car.wheelFrontRight) &&
                Objects.equals(wheelBackLeft, car.wheelBackLeft) &&
                Objects.equals(wheelBackRight, car.wheelBackRight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(markCar, engine, wheelFrontLeft, wheelFrontRight, wheelBackLeft, wheelBackRight);
    }

    @Override
    public String toString() {
        return "Car{" +
                "markCar='" + markCar + '\'' +
                ", engine=" + engine +
                ", wheelFrontLeft=" + wheelFrontLeft +
                ", wheelFrontRight=" + wheelFrontRight +
                ", wheelBackLeft=" + wheelBackLeft +
                ", wheelBackRight=" + wheelBackRight +
                '}';
    }
}
