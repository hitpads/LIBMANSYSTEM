package behavioral;

public class BookObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Notification received: " + message);
    }
}