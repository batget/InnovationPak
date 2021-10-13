package by.belohvostik.innovationpak.controllers;


import by.belohvostik.innovationpak.models.User;
import by.belohvostik.innovationpak.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NewController {

private UserService userService;

    @GetMapping("/hello/{id}")
    public User sayHello(@PathVariable Long id) {
        return userService.getUser(id);
    }
}
