package nl.wessel.domain_platform.A.Controller;


import nl.wessel.domain_platform.B.BusinessLogic.DTO.Client.CreateClient;
import nl.wessel.domain_platform.B.BusinessLogic.DTO.Client.CreatedClient;
import nl.wessel.domain_platform.B.BusinessLogic.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/client")
public class ClientController {

    ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }



    @GetMapping("/new")
    public ResponseEntity<CreatedClient> newClient(@RequestBody CreateClient client) {
        final CreatedClient createdClient = clientService.newClient(client);
        return ResponseEntity.ok().body(createdClient);


    }




}
