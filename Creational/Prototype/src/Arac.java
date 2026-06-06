public class Arac implements Prototype{

    private String marka;
    private String model;

    public Arac(String marka, String model){
        this.marka = marka;
        this.model = model;
    }

    // Cloneable sınıfımızı kendimiz oluşturduk ve burada onun implementation yaptık
    @Override
    public Prototype clone() {
        return new Arac(this.marka, this.model);
    }

    public void bilgileriGoster(){
        System.out.println("marka: " + marka + " model: " + model);
    }
}
