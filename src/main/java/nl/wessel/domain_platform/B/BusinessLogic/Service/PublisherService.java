package nl.wessel.domain_platform.B.BusinessLogic.Service;

import nl.wessel.domain_platform.B.BusinessLogic.DTO.Market.CreateMarket;
import nl.wessel.domain_platform.B.BusinessLogic.DTO.Market.CreatedMarket;
import nl.wessel.domain_platform.B.BusinessLogic.DTO.Publisher.CreatePublisher;
import nl.wessel.domain_platform.B.BusinessLogic.DTO.Publisher.CreatedPublisher;
import nl.wessel.domain_platform.B.BusinessLogic.Model.Market;
import nl.wessel.domain_platform.B.BusinessLogic.Model.Publisher;
import nl.wessel.domain_platform.C.Repository.PublisherRepo;
import org.springframework.stereotype.Service;

@Service
public class PublisherService {

    private final PublisherRepo publisherRepo;

    public PublisherService(PublisherRepo publisherRepo) {
        this.publisherRepo = publisherRepo;
    }







    public Publisher publisherMaker(CreatePublisher createPublisher){
        Publisher publisher = new Publisher();
        publisher.setName(createPublisher.getName());
        publisher.setEmail(createPublisher.getEmail());
        publisher.setPassword(createPublisher.getPassword());
        return publisher;
    }

    public CreatedPublisher publisherDtoMaker(Publisher publisher){
        CreatedPublisher createdPublisher = new CreatedPublisher();
        createdPublisher.setPublisherID(publisher.getPublisherID());
        createdPublisher.setName(publisher.getName());
        createdPublisher.setEmail(publisher.getEmail());
        createdPublisher.setPassword(publisher.getPassword());
        return createdPublisher;
    }

}
