package by.belohvostik.innovationpak.services;

import by.belohvostik.innovationpak.models.CompanyDetails;
import by.belohvostik.innovationpak.repository.CompanyDetailsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
public class DefCompanyDetailsService implements CompanyDetailsService {

    private final CompanyDetailsRepository companyDetailsRepository;

    @Override
    public CompanyDetails getCompany(Long id) {
        return companyDetailsRepository.findById(id).get();
    }
}
