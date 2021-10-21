package by.belohvostik.innovationpak.repository;

import by.belohvostik.innovationpak.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    Customer getById(Integer id);
}
