package com.ecommerce.project.services;

import com.ecommerce.project.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryService{
    String createCategory(Category category);

    List<Category> getAllCategories();
}
;