public class SmsDecorator extends BildirimDecorator{

    public SmsDecorator(Bildirim bildirim){
        super(bildirim);
    }

    @Override
    public String gonder() {
        return bildirim.gonder() + ", SMS";
    }
}
