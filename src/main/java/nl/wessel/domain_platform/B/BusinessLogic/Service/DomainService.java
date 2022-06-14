package nl.wessel.domain_platform.B.BusinessLogic.Service;



import nl.wessel.domain_platform.B.BusinessLogic.DTO.Domain.CreateDomain;
import nl.wessel.domain_platform.B.BusinessLogic.DTO.Domain.CreatedDomain;

import nl.wessel.domain_platform.B.BusinessLogic.Exception.RecordNotFound;
import nl.wessel.domain_platform.B.BusinessLogic.Model.Domain;
import nl.wessel.domain_platform.C.Repository.DomainRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
        createdDomain.setDomainID(domain.getDomainID());
        createdDomain.setName(domain.getName());
        createdDomain.setTld(domain.getTld());
        createdDomain.setCategory(domain.getCategory());
        createdDomain.setPrice(domain.getPrice());
        return createdDomain;
    }

// create
    public CreatedDomain newDomain(CreateDomain createDomain){
        Domain domain = domainMaker(createDomain);
        domainRepo.save(domain);
        return domainDtoMaker(domain);
    }

//    read
public List<CreatedDomain> getList() {
    List<Domain> domainList = domainRepo.findAll();
    List<CreatedDomain> createdDomainList = new ArrayList<>();

    for (Domain domain : domainList) {
        CreatedDomain createdDomain = domainDtoMaker(domain);
        createdDomainList.add(createdDomain);
    }
    return createdDomainList;
}


    public List<CreatedDomain> getListByName(String name) {
        List<Domain> domainList = domainRepo.findDomainsByName(name);
        List<CreatedDomain> createdDomainList = new ArrayList<>();

        for (Domain domain : domainList) {
            CreatedDomain createdDomain = domainDtoMaker(domain);
            createdDomainList.add(createdDomain);
        }
        return createdDomainList;
    }

    public CreatedDomain getListByID(Long idDomain) {
        if (domainRepo.findById(idDomain).isPresent()) {
            Domain domain = domainRepo.findById(idDomain).get();
            return domainDtoMaker(domain);
        } else {
            throw new RecordNotFound("Could not find that domain");
        }
    }



    //    update
    public CreatedDomain update(Long domainID, CreateDomain createDomain) {
        if (domainRepo.findById(domainID).isPresent()) {
            Domain domain = domainRepo.findById(domainID).get();
            Domain domain1 = domainMaker(createDomain);

            domain1.setDomainID(domain.getDomainID());
            domainRepo.save(domain1);
            return domainDtoMaker(domain1);
        } else {
            throw new RecordNotFound("Could not find that domain");
        }
    }

    //    delete

    public void deleteById(Long domainID) {
        domainRepo.deleteById(domainID);
    }

}
