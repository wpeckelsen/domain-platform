package nl.wessel.domain_platform.C.Repository;

import nl.wessel.domain_platform.B.BusinessLogic.Model.Market;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarketRepo extends JpaRepository<Market, Long> {
}
