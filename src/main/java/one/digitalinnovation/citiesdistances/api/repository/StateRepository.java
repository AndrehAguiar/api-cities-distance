package one.digitalinnovation.citiesdistances.api.repository;

import one.digitalinnovation.citiesdistances.api.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
