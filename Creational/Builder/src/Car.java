public class Car {

    private String model;
    private String motor;

    public String getModel() {
        return model;
    }

    public String getMotor() {
        return motor;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", motor='" + motor + '\'' +
                '}';
    }
}
