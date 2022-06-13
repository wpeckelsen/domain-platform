package nl.wessel.domain_platform.B.BusinessLogic.Model;

import javax.persistence.*;
import java.net.URL;
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
    private URL anchorLink;

    @Column(length = 50)
    private String language;

    private Market market;

}
