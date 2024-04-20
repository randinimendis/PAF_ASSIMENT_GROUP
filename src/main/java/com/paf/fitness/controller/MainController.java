package com.paf.fitness.controller;

import com.paf.fitness.model.Mealplan;
import com.paf.fitness.repo.MealplansRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    MealplansRepo mealplansRepo;

    @PostMapping("/addMeal")
    public void addMeal(@RequestBody Mealplan mealplan){
        System.out.println("mealplansRepo: " + mealplansRepo); // Add logging statement
        mealplansRepo.save(mealplan);
    }
}

