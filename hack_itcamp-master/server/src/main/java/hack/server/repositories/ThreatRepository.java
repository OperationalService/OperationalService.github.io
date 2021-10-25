package hack.server.repositories;

import hack.server.models.Threat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThreatRepository extends JpaRepository<Threat, String> {
}
