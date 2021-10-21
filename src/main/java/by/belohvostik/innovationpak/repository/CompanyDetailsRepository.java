package by.belohvostik.innovationpak.repository;

import by.belohvostik.innovationpak.models.CompanyDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDetailsRepository extends JpaRepository<CompanyDetails,Long> {

    CompanyDetails getById(Long id);

}
