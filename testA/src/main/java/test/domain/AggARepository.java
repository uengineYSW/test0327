package test.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import test.domain.*;

@RepositoryRestResource(collectionResourceRel = "aggAS", path = "aggAS")
public interface AggARepository
    extends PagingAndSortingRepository<AggA, Long> {}
