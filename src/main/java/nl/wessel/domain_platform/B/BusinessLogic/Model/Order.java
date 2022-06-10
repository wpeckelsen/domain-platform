package nl.wessel.domain_platform.B.BusinessLogic.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderID;
    private int wordCount;
    private Date dueDate;

    @Column(length = 50)
    private String topic;

    @Column(length = 1000)
    private String anchorLink;

    @Column(length = 50)
    private String language;

    private Market market;

}
