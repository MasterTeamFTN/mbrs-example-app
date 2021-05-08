package mbrs.exampleapp.service.user;

import mbrs.exampleapp.domain.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllByProduct(Long productId);

    List<User> getAllByStorage(Long storageId);

    User getUserById(Long id);
}
