package mbrs.exampleapp.controller;

import lombok.RequiredArgsConstructor;
import mbrs.exampleapp.service.storage.StorageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/storage")
@RequiredArgsConstructor
public class StorageController {

    private final StorageService storageService;

    @GetMapping("/all")
    public String getAll(Model model) {
        model.addAttribute("storages", storageService.getAll());
        return "storages";
    }
}
