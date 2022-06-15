package nl.wessel.platform.C.Repository;

import nl.wessel.platform.B.BusinessLogic.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepo extends JpaRepository<Client, Long> {
    List<Client> findClientsByName(String name);
}
