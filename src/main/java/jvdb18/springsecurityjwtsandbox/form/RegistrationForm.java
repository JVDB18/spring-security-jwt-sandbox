package jvdb18.springsecurityjwtsandbox.form;

import java.util.Set;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jvdb18.springsecurityjwtsandbox.model.entity.User;
import lombok.Data;

@Data
public class RegistrationForm {

    @NotNull
    private String username;
    @NotNull
    private String email;
    @NotNull
    @Size(min = 4)
    private String password;

    public User toEntity(){

        User user = new User();
        user.setUsername( username );
        user.setPassword( password );
        user.setEmail(email);
        user.setRoles( Set.of("USER") );
        return user;

    }
}
