public abstract class BildirimDecorator implements Bildirim {

    protected Bildirim bildirim;

    public BildirimDecorator(Bildirim bildirim){
        this.bildirim = bildirim;
    }
}
