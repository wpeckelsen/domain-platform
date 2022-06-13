package nl.wessel.domain_platform.B.BusinessLogic.DTO.Deal;


import nl.wessel.domain_platform.B.BusinessLogic.Model.Client;
import nl.wessel.domain_platform.B.BusinessLogic.Model.Domain;
import nl.wessel.domain_platform.B.BusinessLogic.Model.Publisher;

import javax.persistence.Column;
import java.util.Date;

public class CreateDeal {


    private Date dueDate;
    private String paymentType;
    private String terms;
    private int price;

//    private Long dealID;
//    private Publisher publisher;
//    private Domain domain;
//    private Client client;


    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
