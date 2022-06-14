package nl.wessel.domain_platform.B.BusinessLogic.Service;


import nl.wessel.domain_platform.B.BusinessLogic.DTO.Client.CreateClient;
import nl.wessel.domain_platform.B.BusinessLogic.DTO.Client.CreatedClient;
import nl.wessel.domain_platform.B.BusinessLogic.Exception.RecordNotFound;
import nl.wessel.domain_platform.B.BusinessLogic.Model.Client;
import nl.wessel.domain_platform.C.Repository.ClientRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    private final ClientRepo clientRepo;

    public ClientService(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    public static CreatedClient clientDtoMaker(Client client){
        CreatedClient createdClient = new CreatedClient();


        createdClient.setClientID(client.getClientID());
        createdClient.setEmail(client.getEmail());
        createdClient.setName(client.getName());
        createdClient.setPassword(client.getPassword());

        createdClient.setMarkets(client.getMarkets());
        createdClient.setOrders(client.getOrders());
        createdClient.setDoneDeals(client.getDoneDeals());

        return createdClient;
    }

    public static Client clientMaker(CreateClient createClient){
        Client client = new Client();
        client.setEmail(createClient.getEmail());
        client.setName(createClient.getName());
        client.setPassword(createClient.getPassword());
        return client;
    }


    //    CREATE
    public CreatedClient newClient(CreateClient createClient){
        Client client = clientMaker(createClient);
        clientRepo.save(client);
        return clientDtoMaker(client);
    }

    //    READ
    public List<CreatedClient> getList() {
    List<Client> clientList = clientRepo.findAll();
    List<CreatedClient> createdClientList = new ArrayList<>();

    for (Client client : clientList) {
        CreatedClient createdClient = clientDtoMaker(client);
        createdClientList.add(createdClient);
    }
    return createdClientList;
}

    public List<CreatedClient> getListByName(String name) {
        List<Client> clientList = clientRepo.findClientsByName(name);
        List<CreatedClient> createdClientList = new ArrayList<>();

        for (Client client : clientList) {
            CreatedClient createdClient = clientDtoMaker(client);
            createdClientList.add(createdClient);
        }
        return createdClientList;
    }

    public CreatedClient getListByID(Long idClient) {
        if (clientRepo.findById(idClient).isPresent()) {
            Client client = clientRepo.findById(idClient).get();
            return clientDtoMaker(client);
        } else {
            throw new RecordNotFound("Could not find that client");
        }
    }



    //    update
    public CreatedClient update(Long clientID, CreateClient createClient) {
        if (clientRepo.findById(clientID).isPresent()) {
            Client client = clientRepo.findById(clientID).get();
            Client client1 = clientMaker(createClient);

            client1.setClientID(client.getClientID());
            clientRepo.save(client1);
            return clientDtoMaker(client1);
        } else {
            throw new RecordNotFound("Could not find that client");
        }
    }

    //    delete

    public void deleteById(Long clientID) {
    clientRepo.deleteById(clientID);
}


}


