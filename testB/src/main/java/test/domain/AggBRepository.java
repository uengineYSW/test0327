package test.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import test.domain.*;

@RepositoryRestResource(collectionResourceRel = "aggBS", path = "aggBS")
public interface AggBRepository
    extends PagingAndSortingRepository<AggB, Long> {}
