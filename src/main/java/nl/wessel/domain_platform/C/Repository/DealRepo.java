package nl.wessel.domain_platform.C.Repository;

import nl.wessel.domain_platform.B.BusinessLogic.Model.Deal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DealRepo extends JpaRepository<Deal, Long> {
}
