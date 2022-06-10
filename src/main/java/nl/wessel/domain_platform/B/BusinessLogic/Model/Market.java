package nl.wessel.domain_platform.B.BusinessLogic.Model;


import javax.persistence.*;
import java.util.List;

@Entity
public class Market {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long marketID;

    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String TLDs;
    private List<Client> clients;
    private List<Publisher> publishers;

}
