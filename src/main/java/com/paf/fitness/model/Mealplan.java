package com.paf.fitness.model;

import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Builder
@Data

public class Mealplan {
    @Id
    private String id;
    private String name;
    private String meal;

}
