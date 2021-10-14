package by.belohvostik.innovationpak.repository;

import by.belohvostik.innovationpak.models.CompanyDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDetailsRepository extends CrudRepository<CompanyDetails,Long> {

}
