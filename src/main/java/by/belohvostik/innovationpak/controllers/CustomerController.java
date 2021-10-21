package by.belohvostik.innovationpak.controllers;

import by.belohvostik.innovationpak.models.Customer;
import by.belohvostik.innovationpak.services.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Customer")
public record CustomerController(CustomerService customerService) {

    @GetMapping("/read/{id}")
    public Customer readCustomer(@PathVariable Integer id) {
        return customerService.getCustomerFindById(id);
    }

    @GetMapping("/readAll")
    public List<Customer> readCompanyAll(Customer customer) {
        return customerService.readAll();

    }

    @PostMapping("/create")
    public Customer create(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @PutMapping("/update")
    public Customer update(@RequestBody Customer customer) {
        return customerService.update(customer);
    }


    @DeleteMapping ("/delete/{id}")
    public void delete(@PathVariable("id)") int id) {
        customerService.deleteById(id);
    }
}
