package hack.server.repositories;

import hack.server.models.OperationalProcess;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationalProcessRepository extends JpaRepository<OperationalProcess, String> {
}
