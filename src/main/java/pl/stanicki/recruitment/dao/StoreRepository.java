package pl.stanicki.recruitment.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.stanicki.recruitment.dao.entity.Store;

@Repository
public interface StoreRepository extends CrudRepository<Store, Integer> {
}
