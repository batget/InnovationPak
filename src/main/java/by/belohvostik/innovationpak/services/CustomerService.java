package by.belohvostik.innovationpak.services;

import by.belohvostik.innovationpak.models.Customer;

import java.util.List;

public interface CustomerService {

    Customer getCustomerFindById(Integer id);

    List<Customer> readAll();

    Customer save(Customer customer);

    Customer update(Customer customer);

    void deleteById(int id);
}
