package org.springframework.samples.petclinic.feeding;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface FeedingRepository extends CrudRepository<Feeding, Integer> {
    List<Feeding> findAll();
    
    @Query("SELECT p FROM FeedingType p")
    List<FeedingType> findAllFeedingTypes();
    
    @Query("SELECT p FROM FeedingType p WHERE p.name=?1")
    FeedingType findFeedingType(String name);
    
    Optional<Feeding> findById(int id);
    Feeding save(Feeding p);
}
