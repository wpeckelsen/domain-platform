package nl.wessel.platform.B.BusinessLogic.DTO.Market;

import nl.wessel.platform.B.BusinessLogic.Model.Client;
import nl.wessel.platform.B.BusinessLogic.Model.Publisher;

import java.util.List;

public class CreateMarket {

    private String name;
    private List<String> TLDs;

//    TODO
    private List<Client> clients;
    private List<Publisher> publishers;


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
