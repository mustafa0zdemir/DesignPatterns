public class Main {
    public static void main(String[] args){

        Calisanlar calisanlar1 = new Calisanlar();

        calisanlar1.ekle("ali");
        calisanlar1.ekle("ahmet");

        Calisanlar calisanlar2 = calisanlar1.clone();

        calisanlar2.ekle("hakan");

        calisanlar1.listele();
        calisanlar2.listele();



    }
}
