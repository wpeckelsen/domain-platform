package nl.wessel.domain_platform.B.BusinessLogic.Model;

import javax.persistence.*;
import java.util.List;


@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientID;

    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String email;

    @Column(length = 500)
    private String password;

    private List<Deal> doneDeals;
    private List<Order> orders;
    private List<Market> markets;


}
