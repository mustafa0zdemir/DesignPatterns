public class Main {
    public static void main(String[] args) {

        CarBuilder sedanBuilder = new SedanCarBuilder();
        CarDirector sedanDirector = new CarDirector(sedanBuilder);
        sedanDirector.build();
        Car sedanCar = sedanBuilder.getCar();

        CarBuilder sportBuilder = new SportCarBuilder();
        CarDirector sportDirector = new CarDirector(sportBuilder);
        sportDirector.build();
        Car sportCar = sportBuilder.getCar();

        System.out.println(sedanCar);
        System.out.println(sportCar);
    }
}
