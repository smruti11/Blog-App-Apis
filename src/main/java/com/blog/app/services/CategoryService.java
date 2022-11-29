package com.blog.app.services;

import java.util.List;

import com.blog.app.payloads.CategoryDto;

public interface CategoryService {
	//create
	CategoryDto createCategory(CategoryDto categoryDto);

	//update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

	//delete
	void deleteCategory(Integer categoryId);

	//get
	CategoryDto getCatagory(Integer categoryId);
	
	//all
	List<CategoryDto> getCategories();
}
