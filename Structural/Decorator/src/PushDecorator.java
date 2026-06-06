public class PushDecorator extends BildirimDecorator{

    public PushDecorator(Bildirim bildirim) {
        super(bildirim);
    }

    @Override
    public String gonder() {
        return bildirim.gonder() + ", Push Notification";
    }
}
