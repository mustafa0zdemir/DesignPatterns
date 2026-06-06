public class WhatsAppDecorator extends BildirimDecorator{

    public WhatsAppDecorator(Bildirim bildirim) {
        super(bildirim);
    }

    @Override
    public String gonder() {
        return bildirim.gonder() + ", WhatsApp";
    }
}
