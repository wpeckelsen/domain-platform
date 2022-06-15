package nl.wessel.platform.B.BusinessLogic.Model;


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
