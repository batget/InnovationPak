package by.belohvostik.innovationpak.services;

import by.belohvostik.innovationpak.models.CompanyDetails;

import java.util.List;


public interface CompanyDetailsService {

    CompanyDetails getCompanyFindById(Long id);

    List<CompanyDetails> readAll();

    CompanyDetails save(CompanyDetails companyDetails);

    CompanyDetails update(CompanyDetails companyDetails);

    void deleteById(Long id);

}
