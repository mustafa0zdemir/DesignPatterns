import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== E-SATIŞ UYGULAMASI (STRATEGY PATTERN) ===\n");

        // 1. Senaryo: Standart Müşteri Testi
        Musteri musteri1 = new Musteri("Mustafa Özdemir", new StandartMusteri());
        musteri1.sepeteEkle(100);  // 100 TL'lik ürün
        musteri1.sepeteEkle(200);  // 200 TL'lik ürün
        musteri1.faturaYazdir();   // Bilgileri ekrana basar

        System.out.println("\n-------------------------------------------\n");

        // 2. Senaryo: Premium Müşteri Testi
        Musteri musteri2 = new Musteri("Ahmet Yılmaz", new PremiumMusteri());
        musteri2.sepeteEkle(100);
        musteri2.sepeteEkle(200);
        musteri2.faturaYazdir();
    }
}