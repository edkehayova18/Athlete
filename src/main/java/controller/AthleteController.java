
package controller;
import com.example.athlete.AthleteApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/player")

public class AthleteController  {
    @RequestMapping("/showPlayerFrom")
    public String showForm(Model model) {
        model.addAttribute("athlete", new Athlete());
        return "add-player-form";
    }

    public static String processForm (@ModelAttribute("athlete") Athlete myAthlete){
        return "player-confirmation";
    }

  



}
