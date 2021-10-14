package by.belohvostik.innovationpak.controllers;


import by.belohvostik.innovationpak.models.CompanyDetails;
import by.belohvostik.innovationpak.services.CompanyDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CompanyDetailsController {

private final CompanyDetailsService companyDetailsService;

    @GetMapping("/read/{id}")
    public CompanyDetails sayCompany(@PathVariable Long id) {
        return companyDetailsService.getCompanyFineById(id);
    }
}
