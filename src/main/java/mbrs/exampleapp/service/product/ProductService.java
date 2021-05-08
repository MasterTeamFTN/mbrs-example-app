package mbrs.exampleapp.service.product;

import mbrs.exampleapp.domain.model.Product;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ProductService {

    Product getProductById(Long id);

    List<Product> getAll();

    void save(int barcode, String type, int count);
}
