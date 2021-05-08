package mbrs.exampleapp.controller;

import lombok.RequiredArgsConstructor;
import mbrs.exampleapp.domain.model.Product;
import mbrs.exampleapp.service.product.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping(value = {"/{id}"})
    public String getProductById(Model model, @PathVariable Long id) {
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "product";
    }


    @GetMapping("/all")
    public String getAll(Model model) {
        model.addAttribute("products", productService.getAll());
        return "products";
    }

    @GetMapping("/create")
    public String createProduct() {
        return "create-product";
    }

    @PostMapping("/add")
    public String addProduct(@RequestParam int barcode, @RequestParam String type, @RequestParam int count) {
        productService.save(barcode, type, count);
        return "redirect:/product/all";
    }
}
