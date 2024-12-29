package druyaned.designpatterns.behavioral.observer.src;

public class EmailListener implements EventListener {
    
    private String message;
    
    public EmailListener() {
        this.message = "some email message";
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    @Override public void update(EventManager manager, String event, String file) {
        System.out.println(
                "EventManagerID=" + manager.getId() +
                ", event=" + event +
                ", file=" + file +
                ", message=" + message
        );
    }
    
}
