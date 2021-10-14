package by.belohvostik.innovationpak.repository;

import by.belohvostik.innovationpak.models.ContractSos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractSosRepository extends CrudRepository<ContractSos,Integer> {
}
