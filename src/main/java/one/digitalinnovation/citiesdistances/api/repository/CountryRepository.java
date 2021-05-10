package one.digitalinnovation.citiesdistances.api.repository;

import one.digitalinnovation.citiesdistances.api.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
