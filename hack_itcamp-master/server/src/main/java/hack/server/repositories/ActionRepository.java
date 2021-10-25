package hack.server.repositories;

import hack.server.models.Action;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActionRepository extends JpaRepository<Action, String> {
}
