package by.belohvostik.innovationpak.services;

import by.belohvostik.innovationpak.models.Customer;
import by.belohvostik.innovationpak.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DefCustomerService implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer getCustomerFindById(Integer id) {
        return customerRepository.getById(id);
    }

    @Override
    public List<Customer> readAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return customerRepository.saveAndFlush(customer);
    }

    @Override
    public void deleteById(int id) {
        customerRepository.deleteById(id);

    }
}
