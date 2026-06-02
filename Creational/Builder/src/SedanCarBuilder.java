public class SedanCarBuilder implements CarBuilder {

    private Car car = new Car();


    @Override
    public void buildModel() {
        car.setModel("Sedan");
    }

    @Override
    public void buildEngine() {
        car.setMotor("1.6");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
