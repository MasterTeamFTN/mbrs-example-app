package mbrs.exampleapp.controller;

import lombok.RequiredArgsConstructor;
import mbrs.exampleapp.domain.model.User;
import mbrs.exampleapp.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/byProduct/{productId}")
    public String getAll(Model model, @PathVariable Long productId) {
        model.addAttribute("users", userService.getAllByProduct(productId));
        model.addAttribute("productId", productId);
        return "users-by-field";
    }


    @GetMapping("/byStorage/{storageId}")
    public String getAllByStorage(Model model, @PathVariable Long storageId) {
        model.addAttribute("users", userService.getAllByStorage(storageId));
        model.addAttribute("storageId", storageId);
        return "users-by-field";
    }

    @GetMapping("/{id}")
    public String getUserById(Model model, @PathVariable Long id) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "user";
    }
}
