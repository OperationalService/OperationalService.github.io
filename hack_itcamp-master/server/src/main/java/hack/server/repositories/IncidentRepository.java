package hack.server.repositories;

import hack.server.models.Incident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidentRepository extends JpaRepository<Incident, Integer> {
}
