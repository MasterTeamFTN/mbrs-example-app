package mbrs.exampleapp.service.storage;

import mbrs.exampleapp.domain.model.Product;
import mbrs.exampleapp.domain.model.Storage;

import java.util.List;

public interface StorageService {
    List<Storage> getAll();
}
