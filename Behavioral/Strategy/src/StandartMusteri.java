public class StandartMusteri implements FiyatlandırmaStratejisi{

    @Override
    public double netFiyatHesapla(double hamTutar) {
        return hamTutar * 0.8; // standart müşteri için %20 indirim
    }

    @Override
    public double kargoUcretiHesapla(double hamTutar) {
        return 30.0; // standart kullanıcı kargo ücreti
    }
}
