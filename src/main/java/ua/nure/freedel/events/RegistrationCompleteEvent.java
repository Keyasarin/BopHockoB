package ua.nure.freedel.events;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;
import ua.nure.freedel.user.User;

@Getter
@Setter 
public class RegistrationCompleteEventListener extends ApplicationEvent {

    private User user;
    private String applicationUrl;

    public RegistrationCompleteEventListener(User user, String applicationUrl){
        super(user);
        this.applicationUrl = applicationUrl;
    }
}
