package nl.wessel.domain_platform.B.BusinessLogic.Service;



import nl.wessel.domain_platform.B.BusinessLogic.DTO.Market.CreateMarket;
import nl.wessel.domain_platform.B.BusinessLogic.DTO.Market.CreatedMarket;
import nl.wessel.domain_platform.B.BusinessLogic.Exception.RecordNotFound;
import nl.wessel.domain_platform.B.BusinessLogic.Model.Market;
import nl.wessel.domain_platform.C.Repository.MarketRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


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

//      create
    public CreatedMarket newMarket(CreateMarket createMarket){
        Market market = marketMaker(createMarket);
        marketRepo.save(market);
        return marketDtoMaker(market);
    }


//    read
public List<CreatedMarket> getList() {
    List<Market> marketList = marketRepo.findAll();
    List<CreatedMarket> createdMarketList = new ArrayList<>();

    for (Market market : marketList) {
        CreatedMarket createdMarket = marketDtoMaker(market);
        createdMarketList.add(createdMarket);
    }
    return createdMarketList;
}

    public List<CreatedMarket> getListByName(String name) {
        List<Market> marketList = marketRepo.findMarketsByName(name);
        List<CreatedMarket> createdMarketList = new ArrayList<>();

        for (Market market : marketList) {
            CreatedMarket createdMarket = marketDtoMaker(market);
            createdMarketList.add(createdMarket);
        }
        return createdMarketList;
    }

    public CreatedMarket getListByID(Long marketID) {
        if (marketRepo.findById(marketID).isPresent()) {
            Market market = marketRepo.findById(marketID).get();
            return marketDtoMaker(market);
        } else {
            throw new RecordNotFound("Could not find that market");
        }
    }



    //    update
    public CreatedMarket update(Long identityCode, CreateMarket createMarket) {
        if (marketRepo.findById(identityCode).isPresent()) {
            Market market = marketRepo.findById(identityCode).get();
            Market market1 = marketMaker(createMarket);

            market1.setMarketID(market.getMarketID());
            marketRepo.save(market1);
            return marketDtoMaker(market1);
        } else {
            throw new RecordNotFound("Could not find that market ");
        }
    }

    //    delete

    public void deleteById(Long identityCode) {
        marketRepo.deleteById(identityCode);
    }


}
