package challange.dockerspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class health {
    @GetMapping
    public String healthResource(){
        return "{status:healthy, container:? ,project:https://github.com/Lexarity/devops-challange }";

    }
}
