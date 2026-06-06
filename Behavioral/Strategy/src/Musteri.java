import java.util.ArrayList;
import java.util.List;

public class Musteri {
    private String isim;
    private List<Double> sepet;
    // Abstraction kullanımı: Sınıf somut bir yapıya değil, arayüze bağımlıdır (Loose Coupling)
    private FiyatlandırmaStratejisi strateji;

    public Musteri(String isim, FiyatlandırmaStratejisi strateji) {
        this.isim = isim;
        this.strateji = strateji;
        this.sepet = new ArrayList<>();
    }

    public void sepeteEkle(double urunFiyati) {
        sepet.add(urunFiyati);
    }

    public double hamSepetTutariniHesapla() {
        double toplam = 0;
        for (double fiyat : sepet) {
            toplam += fiyat;
        }
        return toplam;
    }

    // Müşteri bilgilerini ve hesaplamaları ekrana yazdıran metot
    public void faturaYazdir() {
        double hamTutar = hamSepetTutariniHesapla();

        // Polymorphism burada çalışır: 'strateji' nesnesinin Standart mı Premium mu
        // olduğuna bağlı olarak doğru metotlar tetiklenir.
        double indirimliTutar = strateji.netFiyatHesapla(hamTutar);
        double kargoUcreti = strateji.kargoUcretiHesapla(hamTutar);
        double toplamOdenecek = indirimliTutar + kargoUcreti;

        System.out.println("Müşteri Adı: " + isim);
        System.out.println("Müşteri Türü: " + strateji.getClass().getSimpleName().replace("Stratejisi", ""));
        System.out.println("Brüt Sepet Tutarı: " + hamTutar + " TL");
        System.out.println("İndirimli Ürün Tutarı: " + indirimliTutar + " TL");
        System.out.println("Kargo Ücreti: " + (kargoUcreti == 0 ? "Ücretsiz" : kargoUcreti + " TL"));
        System.out.println("Toplam Ödenecek Tutar: " + toplamOdenecek + " TL");
    }
}
