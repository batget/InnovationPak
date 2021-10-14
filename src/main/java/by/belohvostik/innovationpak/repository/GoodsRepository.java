package by.belohvostik.innovationpak.repository;

import by.belohvostik.innovationpak.models.Goods;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsRepository extends CrudRepository<Goods,Integer> {
}
