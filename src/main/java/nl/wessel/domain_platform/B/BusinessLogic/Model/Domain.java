package nl.wessel.domain_platform.B.BusinessLogic.Model;

import javax.persistence.*;

@Entity
public class Domain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long domainID;

    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String tld;

    @Column(length = 50)
    private String category;

    private int price;

    private Publisher publisher;




}
