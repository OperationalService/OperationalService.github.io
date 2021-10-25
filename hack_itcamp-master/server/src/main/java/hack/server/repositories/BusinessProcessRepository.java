package hack.server.repositories;

import hack.server.models.BusinessProcess;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessProcessRepository extends JpaRepository<BusinessProcess, String> {
}
