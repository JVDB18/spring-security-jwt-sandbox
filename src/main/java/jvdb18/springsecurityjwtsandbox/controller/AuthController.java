package jvdb18.springsecurityjwtsandbox.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import jvdb18.springsecurityjwtsandbox.form.LoginForm;
import jvdb18.springsecurityjwtsandbox.form.RegistrationForm;
import jvdb18.springsecurityjwtsandbox.jwt.JwtHolderDTO;
import jvdb18.springsecurityjwtsandbox.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController( AuthService authService) {
        this.authService = authService;
    }
    @CrossOrigin
    @PostMapping("/register")
    public void register(@RequestBody @Valid RegistrationForm form) throws Exception{
        authService.register( form );
    }
    @CrossOrigin
    @PostMapping("/sign_in")
    public JwtHolderDTO login(@RequestBody @Valid LoginForm form){
        return authService.login( form );
    }

}
