package by.belohvostik.innovationpak.repository;

import by.belohvostik.innovationpak.models.ContractSos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractSosRepository extends JpaRepository<ContractSos,Integer> {

    ContractSos getById(Integer id);
}
