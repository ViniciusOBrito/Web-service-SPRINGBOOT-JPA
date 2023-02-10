package com.PDCase.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PDCase.course.entities.Category;
import com.PDCase.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	public List<Category> findAll(){	
		return categoryRepository.findAll();
	}
	
	public Category findById(Long id){
		Optional<Category> obj = categoryRepository.findById(id);
		return obj.get();
	}
}
