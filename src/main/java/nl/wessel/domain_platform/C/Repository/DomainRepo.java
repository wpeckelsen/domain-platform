package nl.wessel.domain_platform.C.Repository;

import nl.wessel.domain_platform.B.BusinessLogic.Model.Domain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomainRepo extends JpaRepository<Domain, Long> {
}
