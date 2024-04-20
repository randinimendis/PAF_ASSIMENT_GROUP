package com.paf.fitness.repo;

import com.paf.fitness.model.Mealplan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealplansRepo extends MongoRepository<Mealplan, String> {
}
