package by.belohvostik.innovationpak.services;

import by.belohvostik.innovationpak.models.CompanyDetails;
import by.belohvostik.innovationpak.repository.CompanyDetailsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
@RequiredArgsConstructor
public class DefCompanyDetailsService implements CompanyDetailsService {

    private final CompanyDetailsRepository companyDetailsRepository;

    @Override
    public CompanyDetails getCompanyFindById(Long id) {
        return companyDetailsRepository.getById(id);
    }

    @Override
    public List<CompanyDetails> readAll() {
        return companyDetailsRepository.findAll();
    }

    @Override
    public CompanyDetails save(CompanyDetails companyDetails) {
        return companyDetailsRepository.save(companyDetails);
    }

    @Override
    public CompanyDetails update(CompanyDetails companyDetails) {
        return companyDetailsRepository.saveAndFlush(companyDetails);
    }


    @Override
    public void deleteById(Long id) {
        companyDetailsRepository.deleteById(id);

    }


}
