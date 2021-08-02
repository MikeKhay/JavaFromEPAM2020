package chapter4ExtensAndPolymorphism.optionA.task2;

public class ControlCar {
    public static void main(String[] args) {
        Car car = new Car("BMW", new Engine(1111), new Wheel(1), new Wheel(2), new Wheel(3),
                new Wheel(4));

        System.out.println(car.toString());

        car.methodGo();
        car.getEngine().methodRefuel();
        car.getWheelFrontLeft().changeWheel(new Wheel(7));
        car.getWheelFrontRight().changeWheel(new Wheel(9));
        car.methodPrintMarkCar();

        System.out.println(car.toString());
    }
}
