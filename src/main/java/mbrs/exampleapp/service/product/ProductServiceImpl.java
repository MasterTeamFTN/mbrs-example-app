package mbrs.exampleapp.service.product;

import lombok.RequiredArgsConstructor;
import mbrs.exampleapp.dao.product.ProductRepository;
import mbrs.exampleapp.domain.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product getProductById(Long id) {
        return productRepository.getById(id);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public void save(int barcode, String type, int count) {
        productRepository.save(barcode, type, count);
    }
}
