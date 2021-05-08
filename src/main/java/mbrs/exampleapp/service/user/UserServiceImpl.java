package mbrs.exampleapp.service.user;

import lombok.RequiredArgsConstructor;
import mbrs.exampleapp.dao.product.ProductRepository;
import mbrs.exampleapp.dao.user.UserRepository;
import mbrs.exampleapp.domain.model.Product;
import mbrs.exampleapp.domain.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> getAllByProduct(Long productId) {
        return userRepository.getAllByProduct(productId);
    }

    @Override
    public List<User> getAllByStorage(Long storageId) {
        return userRepository.getAllByStorage(storageId);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getById(id);
    }
}
