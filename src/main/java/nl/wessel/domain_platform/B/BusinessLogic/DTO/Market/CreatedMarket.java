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


    public Long getMarketID() {
        return marketID;
    }

    public void setMarketID(Long marketID) {
        this.marketID = marketID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTLDs() {
        return TLDs;
    }

    public void setTLDs(List<String> TLDs) {
        this.TLDs = TLDs;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Publisher> getPublishers() {
        return publishers;
    }

    public void setPublishers(List<Publisher> publishers) {
        this.publishers = publishers;
    }
}
