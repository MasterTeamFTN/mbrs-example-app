package mbrs.exampleapp.dao.product;

import mbrs.exampleapp.domain.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class ProductRepository {

    @PersistenceContext
    EntityManager entityManager;


    public Product getById(Long id) {
        Product product = entityManager.find(Product.class, id);
        entityManager.detach(product);
        return product;
    }

    public List<Product> getAll() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Product> cq = cb.createQuery(Product.class);
        Root<Product> rootEntry = cq.from(Product.class);
        CriteriaQuery<Product> all = cq.select(rootEntry);
        TypedQuery<Product> allQuery = entityManager.createQuery(all);
        return allQuery.getResultList();
    }

    @Transactional
    public void save(int barcode, String type, int count) {
        Product product = new Product();
        product.setBarcode(barcode);
        product.setType(type);
        product.setCount(count);

        entityManager.persist(product);
    }
}
