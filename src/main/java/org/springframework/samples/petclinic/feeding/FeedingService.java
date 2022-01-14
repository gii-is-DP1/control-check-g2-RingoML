package org.springframework.samples.petclinic.feeding;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedingService {
	
	@Autowired
	private FeedingRepository feedingRepository;
	
    public List<Feeding> getAll(){
        return feedingRepository.findAll();
    }

    public List<FeedingType> getAllFeedingTypes(){
        return feedingRepository.findAllFeedingTypes();
    }

    public FeedingType getFeedingType(String typeName) {
        return feedingRepository.findFeedingType(typeName);
    }

    public Feeding save(Feeding p) throws UnfeasibleFeedingException {
    	//feedingRepository.save(p);
    	return null;
 
    }

    
}
