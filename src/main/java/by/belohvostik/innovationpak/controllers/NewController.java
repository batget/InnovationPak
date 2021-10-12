package by.belohvostik.innovationpak.controllers;

import by.belohvostik.innovationpak.repository.CompanyDetailsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {

    private final CompanyDetailsRepository companyDetailsRepository;

    public NewController(CompanyDetailsRepository companyDetailsRepository) {
        this.companyDetailsRepository = companyDetailsRepository;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return companyDetailsRepository.create();
    }
}
