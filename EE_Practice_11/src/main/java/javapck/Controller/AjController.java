package javapck.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class AjController {

    @RequestMapping(value = "/")
    public String home(Model model) {
        return "index";
    }

}