package by.belohvostik.innovationpak.repository;

import by.belohvostik.innovationpak.models.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends CrudRepository<Orders,Integer> {
}
