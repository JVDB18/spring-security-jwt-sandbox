package jvdb18.springsecurityjwtsandbox.service;

import jvdb18.springsecurityjwtsandbox.form.LoginForm;
import jvdb18.springsecurityjwtsandbox.form.RegistrationForm;
import jvdb18.springsecurityjwtsandbox.jwt.JwtHolderDTO;

public interface AuthService {

    void register( RegistrationForm form );

    JwtHolderDTO login(LoginForm form );

}