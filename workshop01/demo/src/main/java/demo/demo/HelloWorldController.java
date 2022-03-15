package demo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "https://github.com/eric2022git/myrepo1/tree/main/workshop01/demo");
        return "helloworld";
    }
}
