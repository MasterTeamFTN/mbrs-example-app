package mbrs.exampleapp.dao.storage;

import mbrs.exampleapp.domain.model.Product;
import mbrs.exampleapp.domain.model.Storage;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class StorageRepository {
    @PersistenceContext
    EntityManager entityManager;


    public List<Storage> getAll() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Storage> cq = cb.createQuery(Storage.class);
        Root<Storage> rootEntry = cq.from(Storage.class);
        CriteriaQuery<Storage> all = cq.select(rootEntry);
        TypedQuery<Storage> allQuery = entityManager.createQuery(all);
        return allQuery.getResultList();
    }
}
