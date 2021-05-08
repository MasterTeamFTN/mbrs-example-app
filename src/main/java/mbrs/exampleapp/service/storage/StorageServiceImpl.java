package mbrs.exampleapp.service.storage;

import lombok.RequiredArgsConstructor;
import mbrs.exampleapp.dao.storage.StorageRepository;
import mbrs.exampleapp.domain.model.Storage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StorageServiceImpl implements StorageService {

    private final StorageRepository storageRepository;

    @Override
    public List<Storage> getAll() {
        return storageRepository.getAll();
    }
}
