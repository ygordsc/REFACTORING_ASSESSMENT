package ex5;

public class EmailService implements NotificationService {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
