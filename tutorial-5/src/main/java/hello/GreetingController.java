package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false)
                                       String name, Model model) {
        /* model.addAttribute("name", name); */
        if (name == null || name.equals("")) {
            model.addAttribute("title", "This is my CV");
        } else {
            model.addAttribute("title", name + ", I hope you interested to hire me");
        }

        StringBuilder cv = new StringBuilder();
        cv.append("Kristianto\n");
        cv.append("Birthdate: July, 28th 1998\n");
        cv.append("Birthplace: Jakarta\n");
        cv.append("Education history:\n");
        cv.append(" - Universitas Indonesia (2016-now)\n");
        cv.append(" - SMA Galatia Bekasi (2013-2016)\n");
        cv.append(" - SMP St. Maria Della Strada (2010-2013)\n");
        cv.append(" - SD Santo Lukas 1 (2004-2010)\n");
        model.addAttribute("cv", cv.toString());

        StringBuilder desc = new StringBuilder();
        desc.append("I'm currently a sophomore at Universitas Indonesia. \n");
        desc.append("I'm also a teaching assistant for Foundation of Programming 2. \n");
        model.addAttribute("description", desc.toString());


        return "greeting";
    }

}
