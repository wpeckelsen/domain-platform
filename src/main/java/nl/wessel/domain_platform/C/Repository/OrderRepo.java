package nl.wessel.domain_platform.C.Repository;

import nl.wessel.domain_platform.B.BusinessLogic.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
