package atu.hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name){
        return "Greetings "+ name;

    }


}
