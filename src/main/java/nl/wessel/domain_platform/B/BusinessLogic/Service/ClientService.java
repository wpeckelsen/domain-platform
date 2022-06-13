package nl.wessel.domain_platform.B.BusinessLogic.Service;


import nl.wessel.domain_platform.B.BusinessLogic.DTO.Client.CreateClient;
import nl.wessel.domain_platform.B.BusinessLogic.DTO.Client.CreatedClient;
import nl.wessel.domain_platform.B.BusinessLogic.Model.Client;
import nl.wessel.domain_platform.C.Repository.ClientRepo;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

   private final ClientRepo clientRepo;
    public ClientService(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    //    new client
    public CreatedClient newClient(CreateClient createClient){
        Client client = clientMaker(createClient);
        clientRepo.save(client);
        return clientDtoMaker(client);
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

}
