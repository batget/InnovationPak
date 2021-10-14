package by.belohvostik.innovationpak.repository;

import by.belohvostik.innovationpak.models.Protocol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProtocolRepository extends CrudRepository<Protocol,Integer> {
}
