package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MyController {
    @GetMapping(value ="/add/{a}/{b}" )
    public  String myString(@PathVariable String a, @PathVariable String b, Model model){
        String res=a+b;
        model.addAttribute("msg",res);
        return "index";
    }
}
