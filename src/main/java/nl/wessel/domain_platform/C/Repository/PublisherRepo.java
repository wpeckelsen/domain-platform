package nl.wessel.domain_platform.C.Repository;

import nl.wessel.domain_platform.B.BusinessLogic.Model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepo extends JpaRepository<Publisher, Long> {
}
