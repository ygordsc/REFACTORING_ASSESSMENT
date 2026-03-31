package ex5;

public class PushService implements NotificationService {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending PUSH: " + message);
    }
}
