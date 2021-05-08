package mbrs.exampleapp.dao.user;

import mbrs.exampleapp.domain.model.Product;
import mbrs.exampleapp.domain.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public List<User> getAllByProduct(Long productId) {
        List<User> users = entityManager.createQuery("select u from User u where :productId in (select id from u.products)", User.class)
                .setParameter("productId", productId).getResultList();

        return users;
    }

    @Transactional
    public List<User> getAllByStorage(Long storageId) {
        List<User> users = entityManager.createQuery("select u from User u where :storageId in (select id from u.storage)", User.class)
                .setParameter("storageId", storageId).getResultList();

        return users;
    }

    public User getById(Long id) {
        User user = entityManager.find(User.class, id);
        entityManager.detach(user);
        return user;
    }

}
