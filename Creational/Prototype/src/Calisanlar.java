import java.util.ArrayList;
import java.util.List;

public class Calisanlar implements Cloneable{
    private List <String> Liste;

    public Calisanlar(){
        Liste = new ArrayList<>();
    }

    public void ekle(String isim){
        Liste.add(isim);
    }

    @Override
    public Calisanlar clone(){
        try {
            Calisanlar kopya = (Calisanlar) super.clone();

            kopya.Liste = new ArrayList<>(this.Liste);

            return kopya;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void listele(){
        System.out.println(Liste);
    }

}
