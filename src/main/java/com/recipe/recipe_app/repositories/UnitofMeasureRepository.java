package com.recipe.recipe_app.repositories;

import java.util.Optional;

import com.recipe.recipe_app.domain.UnitofMeasure;

import org.springframework.data.repository.CrudRepository;

public interface UnitofMeasureRepository extends CrudRepository<UnitofMeasure, Long>{

    Optional<UnitofMeasure> findByDescription(String description);
    
}
