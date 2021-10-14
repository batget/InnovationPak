package by.belohvostik.innovationpak.controllers;


import by.belohvostik.innovationpak.models.CompanyDetails;
import by.belohvostik.innovationpak.services.CompanyDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("CompanyDetails")
public record CompanyDetailsController(CompanyDetailsService companyDetailsService) {

    @GetMapping("/read/{id}")
    public CompanyDetails readCompany(@PathVariable Long id) {
        return companyDetailsService.getCompanyFindById(id);
    }
}
