package demo.demo;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    
    @GetMapping("/")
    public String hello(Model model) {
        String[] wisewords = {
            "Logic will get you from A to B. Imagination will take you everywhere.",
            "There are 10 kinds of people. Those who know binary and those who don't.",
            "There are two ways of constructing a software design. One way is to make it so simple that there are obviously no deficiencies and the other is to make it so complicated that there are no obvious deficiencies.",
            "It's not that I'm so smart, it's just that I stay with problems longer.",
            "It is pitch dark. You are likely to be eaten by a grue."
        };
        Random r=new Random();
        int randomNumber=r.nextInt(wisewords.length);
        
        String randomWords=(wisewords[randomNumber]);

        model.addAttribute("randomWords", randomWords);
        model.addAttribute("message", "https://github.com/eric2022git/myrepo1/");
        return "helloworld";
    }
}
