package by.belohvostik.innovationpak.repository;

import by.belohvostik.innovationpak.models.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsRepository extends JpaRepository<Goods,Integer> {

    Goods getById(Integer id);

}
