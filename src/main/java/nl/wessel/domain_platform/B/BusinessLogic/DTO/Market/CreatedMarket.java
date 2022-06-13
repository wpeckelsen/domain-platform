package nl.wessel.domain_platform.B.BusinessLogic.DTO.Market;

import nl.wessel.domain_platform.B.BusinessLogic.Model.Client;
import nl.wessel.domain_platform.B.BusinessLogic.Model.Publisher;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

public class CreatedMarket {

    private Long marketID;
    private String name;

//    TODO
    private List<String> TLDs;
    private List<Client> clients;
    private List<Publisher> publishers;


}
