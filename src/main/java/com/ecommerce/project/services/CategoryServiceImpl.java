package com.ecommerce.project.services;

import com.ecommerce.project.model.Category;
import com.ecommerce.project.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    private long nextId = 1;

    @Override
    public String createCategory(Category category) {
        categoryRepository.save(category);
        return "Category created successfully";
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
