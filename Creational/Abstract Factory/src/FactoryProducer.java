public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounder){
        if(rounder){
            return new RoundedShapeFactory();
        }else {
            return new ShapeFactory();
        }
    }
}
