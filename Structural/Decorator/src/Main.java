public class Main {

    public static void main(String[] args) {

        Bildirim bildirim =
                new EmailBildirim();

        System.out.println(
                bildirim.gonder());

        bildirim =
                new SmsDecorator(bildirim);

        System.out.println(
                bildirim.gonder());

        bildirim =
                new WhatsAppDecorator(
                        bildirim);

        System.out.println(
                bildirim.gonder());

        bildirim =
                new PushDecorator(
                        bildirim);

        System.out.println(
                bildirim.gonder());
    }
}