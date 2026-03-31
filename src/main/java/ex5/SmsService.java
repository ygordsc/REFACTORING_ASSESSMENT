package ex5;

public class SmsService implements NotificationService {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
