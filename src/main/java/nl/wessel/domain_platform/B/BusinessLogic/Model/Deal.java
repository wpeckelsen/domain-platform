package nl.wessel.domain_platform.B.BusinessLogic.Model;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Deal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dealID;
    private int price;
    private Date dueDate;

    @Column(length = 50)
    private String paymentType;

    @Column(length = 2000)
    private String terms;


    private Publisher publisher;
    private Domain domain;
    private Client client;



}
