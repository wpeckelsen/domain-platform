package nl.wessel.domain_platform.C.Repository;

import nl.wessel.domain_platform.B.BusinessLogic.Model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PublisherRepo extends JpaRepository<Publisher, Long> {
    List<Publisher> findPublishersByName(String name);
}
