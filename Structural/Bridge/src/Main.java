

public class Main {
    public static void main(String[] args) {

        Shape kirmiziUcgen = new Triangle(new RedColor());
        kirmiziUcgen.applyColor();

        Shape yesilBesgen = new Pentagon(new GreenColor());
        yesilBesgen.applyColor();
    }
}