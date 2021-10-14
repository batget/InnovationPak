package by.belohvostik.innovationpak.repository;

import by.belohvostik.innovationpak.models.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer> {
}
