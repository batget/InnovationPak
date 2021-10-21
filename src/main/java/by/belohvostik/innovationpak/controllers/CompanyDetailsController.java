package by.belohvostik.innovationpak.controllers;


import by.belohvostik.innovationpak.models.CompanyDetails;
import by.belohvostik.innovationpak.services.CompanyDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Company")
public class CompanyDetailsController {

    private final CompanyDetailsService companyDetailsService;

    public CompanyDetailsController(CompanyDetailsService companyDetailsService) {
        this.companyDetailsService = companyDetailsService;
    }

    @GetMapping("/read/{id}")
    public CompanyDetails readCompanyId(@PathVariable("id") Long id) {
        return companyDetailsService.getCompanyFindById(id);
    }

    @GetMapping("/readAll")
    public List<CompanyDetails> readCompanyAll(CompanyDetails companyDetails) {
        return companyDetailsService.readAll();

    }

    @PostMapping("/create")
    public CompanyDetails create(@RequestBody CompanyDetails companyDetails) {
        return companyDetailsService.save(companyDetails);
    }

    @PutMapping("/update")
    public CompanyDetails update(@RequestBody CompanyDetails companyDetails) {
        return companyDetailsService.update(companyDetails);
    }


    @DeleteMapping ("/delete/{id}")
    public void delete(@PathVariable("id)") Long id) {
        companyDetailsService.deleteById(id);
    }
}
