package by.belohvostik.innovationpak.repository;

import by.belohvostik.innovationpak.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Integer> {

    Orders getById(Integer id);

}
