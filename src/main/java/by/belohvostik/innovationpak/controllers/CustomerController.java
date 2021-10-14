package by.belohvostik.innovationpak.controllers;

import by.belohvostik.innovationpak.models.Customer;
import by.belohvostik.innovationpak.services.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Customer")
public record CustomerController(CustomerService customerService) {

    @GetMapping("/read/{id}")
    public Customer readCustomer(@PathVariable Integer id) {
        return customerService.getCustomerFindById(id);
    }
}
