package nl.wessel.platform.C.Repository;
import nl.wessel.platform.B.BusinessLogic.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {

}
