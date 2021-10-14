package by.belohvostik.innovationpak.services;

import by.belohvostik.innovationpak.models.Customer;
import by.belohvostik.innovationpak.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefCustomerService implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer getCustomerFindById(Integer id) {
        return customerRepository.findById(id).get();
    }
}
