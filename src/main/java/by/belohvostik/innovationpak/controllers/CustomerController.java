package by.belohvostik.innovationpak.controllers;

import by.belohvostik.innovationpak.models.Customer;
import by.belohvostik.innovationpak.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/customer/{id}")
    public Customer sayCustomer(@PathVariable Integer id) {
        return customerService.getCustomer(id);
    }
}
