package snack.web;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @ModelAttribute("year")
    public String getYear() {
        LocalDate d = LocalDate.now();
        return String.valueOf(d.getYear());
    }
}
