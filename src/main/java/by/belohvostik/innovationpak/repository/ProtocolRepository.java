package by.belohvostik.innovationpak.repository;

import by.belohvostik.innovationpak.models.Protocol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProtocolRepository extends JpaRepository<Protocol,Integer> {

    Protocol getById(Integer id);

}
