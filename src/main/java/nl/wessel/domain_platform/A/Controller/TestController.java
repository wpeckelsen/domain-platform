package nl.wessel.domain_platform.A.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class TestController {


    @GetMapping("/test")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok().body("Hello world, test test test" + "username: user, password: on command line");
    }
}
