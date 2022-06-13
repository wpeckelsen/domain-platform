package nl.wessel.domain_platform.B.BusinessLogic.Service;


import nl.wessel.domain_platform.B.BusinessLogic.DTO.Client.CreateClient;
import nl.wessel.domain_platform.B.BusinessLogic.DTO.Client.CreatedClient;
import nl.wessel.domain_platform.B.BusinessLogic.DTO.Deal.CreateDeal;
import nl.wessel.domain_platform.B.BusinessLogic.DTO.Deal.CreatedDeal;
import nl.wessel.domain_platform.B.BusinessLogic.Model.Client;
import nl.wessel.domain_platform.B.BusinessLogic.Model.Deal;
import nl.wessel.domain_platform.C.Repository.DealRepo;
import org.springframework.stereotype.Service;

@Service
public class DealService {

    private final DealRepo dealRepo;
    public DealService(DealRepo dealRepo) {
        this.dealRepo = dealRepo;
    }

    public static Deal dealMaker(CreateDeal createDeal){
        Deal deal = new Deal();
        deal.setDueDate(createDeal.getDueDate());
        deal.setPaymentType(createDeal.getPaymentType());
        deal.setTerms(createDeal.getTerms());
        deal.setPrice(createDeal.getPrice());
        return deal;
    }
    public static CreatedDeal dealDtoMaker(Deal deal){
        CreatedDeal createdDeal = new CreatedDeal();
        createdDeal.setDealID(deal.getDealID());
        createdDeal.setDueDate(deal.getDueDate());
        createdDeal.setPrice(deal.getPrice());
        createdDeal.setPaymentType(deal.getPaymentType());
        createdDeal.setTerms(deal.getTerms());
        return createdDeal;
    }
}
