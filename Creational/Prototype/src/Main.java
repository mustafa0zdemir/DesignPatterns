public class Main {
    public static void main(String[] args){
        // Cloneable sınıfı kullanılarak oluşturulmuş ornek
        Calisanlar calisanlar1 = new Calisanlar();

        calisanlar1.ekle("ali");
        calisanlar1.ekle("ahmet");

        Calisanlar calisanlar2 = calisanlar1.clone();

        calisanlar2.ekle("hakan");

        calisanlar1.listele();
        calisanlar2.listele();

        // Prototype sınıfının manuel olarak oluşturulmuş şeklindeki örnek

        Arac arac1 = new Arac("Toyota", "Corolla");
        arac1.bilgileriGoster();
        Arac arac2 = (Arac) arac1.clone();
        arac2.bilgileriGoster();



    }
}
