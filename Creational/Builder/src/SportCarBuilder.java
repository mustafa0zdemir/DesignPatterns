public class SportCarBuilder implements CarBuilder {
    private Car car = new Car();

    @Override
    public void buildModel() {
        car.setModel("Sport");
    }

    @Override
    public void buildEngine() {
        car.setMotor("3.0 turbo");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
