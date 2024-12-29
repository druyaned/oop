package druyaned.designpatterns.behavioral.mediator.src;

public class DialogForm {
    
    private final String user;
    private final String pass;
    private final boolean stayedIn;
    
    public DialogForm(String user, String pass, boolean stayIn) {
        this.user = user;
        this.pass = pass;
        this.stayedIn = stayIn;
    }
    
    public String getUser() {
        return user;
    }
    
    public String getPass() {
        return pass;
    }
    
    public boolean isStayedIn() {
        return stayedIn;
    }
    
}
