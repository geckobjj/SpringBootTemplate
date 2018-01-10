package reactspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.web.bind.annotation.RequestParam; //Lets us add parameters to requests.  Not used here

@RestController
public class MainController {

    @RequestMapping("/home")
    public String howdy()
    {
        return "Howdy!";
    }
}
