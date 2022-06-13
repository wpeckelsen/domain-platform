package nl.wessel.domain_platform.B.BusinessLogic.Service;

import nl.wessel.domain_platform.B.BusinessLogic.DTO.Domain.CreateDomain;
import nl.wessel.domain_platform.B.BusinessLogic.DTO.Domain.CreatedDomain;
import nl.wessel.domain_platform.B.BusinessLogic.Model.Domain;
import nl.wessel.domain_platform.C.Repository.DomainRepo;
import org.springframework.stereotype.Service;

@Service
public class DomainService {

    private final DomainRepo domainRepo;

    public DomainService(DomainRepo domainRepo) {
        this.domainRepo = domainRepo;
    }


    public Domain domainMaker(CreateDomain createDomain){
        Domain domain = new Domain();
        domain.setName(createDomain.getName());
        domain.setTld(createDomain.getTld());
        domain.setCategory(createDomain.getCategory());
        domain.setPrice(createDomain.getPrice());
        return domain;
    }

    public CreatedDomain domainDtoMaker(Domain domain){
        CreatedDomain createdDomain = new CreatedDomain();
        createdDomain.setDomainID(createdDomain.getDomainID());
        createdDomain.setName(createdDomain.getName());
        createdDomain.setTld(createdDomain.getTld());
        createdDomain.setCategory(createdDomain.getCategory());
        createdDomain.setPrice(createdDomain.getPrice());
        return createdDomain;
    }

}
