package edu.wctc.wfcsecurity;

import edu.wctc.wfcsecurity.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class HomeController {

    private UserService userService;

    @Autowired
    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String showHomePage(Model model, Principal principal) {
        model.addAttribute("users", userService.getAllUsers());

        if (principal != null) {
            model.addAttribute("user", userService.getUser(principal.getName()));
        }
        return "index";
    }

    @GetMapping("/employee-benefits")
    public String showBenefits() {
        return "employee-benefits";
    }

    @Secured("major")
    @RequestMapping("/secret-recipe")
    public String showSecretRecipe() {
        return "secret-recipe";
    }

    @RequestMapping("/login")
    public String showLogin() { return "login"; }
}
