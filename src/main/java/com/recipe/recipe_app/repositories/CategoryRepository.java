package com.recipe.recipe_app.repositories;

import java.util.Optional;

import com.recipe.recipe_app.domain.Category;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long>{

    Optional<Category> findByDescription(String description);

}
