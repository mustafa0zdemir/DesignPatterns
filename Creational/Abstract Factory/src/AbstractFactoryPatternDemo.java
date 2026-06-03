public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // Normal Şekil Fabrikasını al
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw(); // Çıktı: Inside Rectangle::draw() method.

        // Yuvarlatılmış Şekil Fabrikasını al
        AbstractFactory shapeFactory2 = FactoryProducer.getFactory(true);

        Shape shape3 = shapeFactory2.getShape("RECTANGLE");
        shape3.draw(); // Çıktı: Inside RoundedRectangle::draw() method.
    }
}