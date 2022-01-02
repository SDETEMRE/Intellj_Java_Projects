package Day_44_oopReview.callcenter;

public class WhatsApp extends MessagingApp implements VoiceCallable,VideoCallable{

    @Override
    void senMessage(String msg) {
        System.out.println("Whatsapp - sending a message - " + msg + "...");

    }

    @Override
    public void videoCall() {

        System.out.println("Whatsapp - doing a video call Mr Mike...");
    }

    @Override
    public void call(String contact) {

        System.out.println("Whatsapp - calling " + contact + "...");

    }
}
