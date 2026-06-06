public class PremiumMusteri implements FiyatlandırmaStratejisi{

    @Override
    public double netFiyatHesapla(double hamTutar) {
        return hamTutar*0.7; // premium müsteri için %30 indirim
    }

    @Override
    public double kargoUcretiHesapla(double hamTutar) {
        return 0; // premium müsteri için kargo ücreti alınmıyor
    }
}
