package nl.wessel.domain_platform.B.BusinessLogic.Service;

import nl.wessel.domain_platform.B.BusinessLogic.DTO.Domain.CreateDomain;
import nl.wessel.domain_platform.B.BusinessLogic.DTO.Domain.CreatedDomain;
import nl.wessel.domain_platform.B.BusinessLogic.DTO.Market.CreateMarket;
import nl.wessel.domain_platform.B.BusinessLogic.DTO.Market.CreatedMarket;
import nl.wessel.domain_platform.B.BusinessLogic.Model.Domain;
import nl.wessel.domain_platform.B.BusinessLogic.Model.Market;
import nl.wessel.domain_platform.C.Repository.MarketRepo;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.error.Mark;

@Service
public class MarketService {

    private final MarketRepo marketRepo;

    public MarketService(MarketRepo marketRepo) {
        this.marketRepo = marketRepo;
    }


    public Market marketMaker(CreateMarket createMarket){
        Market market = new Market();
        market.setName(createMarket.getName());
        market.setTLDs(createMarket.getTLDs());
        return market;
    }
    public CreatedMarket marketDtoMaker(Market market){
        CreatedMarket createdMarket = new CreatedMarket();
        createdMarket.setMarketID(market.getMarketID());
        createdMarket.setName(market.getName());
        createdMarket.setTLDs(market.getTLDs());
        return createdMarket;
    }

}
