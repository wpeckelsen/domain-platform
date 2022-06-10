package nl.wessel.domain_platform.B.BusinessLogic.DTO.Client;

import nl.wessel.domain_platform.B.BusinessLogic.Model.Deal;
import nl.wessel.domain_platform.B.BusinessLogic.Model.Market;
import nl.wessel.domain_platform.B.BusinessLogic.Model.Order;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

public class CreatedClient {
    private Long clientID;
    private String name;
    private String email;
    private String password;
    private List<Deal> doneDeals;
    private List<Order> orders;
    private List<Market> markets;

    public Long getClientID() {
        return clientID;
    }
    public void setClientID(Long clientID) {
        this.clientID = clientID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public List<Deal> getDoneDeals() {
        return doneDeals;
    }
    public void setDoneDeals(List<Deal> doneDeals) {
        this.doneDeals = doneDeals;
    }
    public List<Order> getOrders() {
        return orders;
    }
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    public List<Market> getMarkets() {
        return markets;
    }
    public void setMarkets(List<Market> markets) {
        this.markets = markets;
    }
}
