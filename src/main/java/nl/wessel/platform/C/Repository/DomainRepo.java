package nl.wessel.platform.C.Repository;

import nl.wessel.platform.B.BusinessLogic.Model.Domain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DomainRepo extends JpaRepository<Domain, Long> {
    List<Domain> findDomainsByName(String name);
}
