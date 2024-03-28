package edu.main.service;

import java.util.List;

import edu.main.entity.Category;

public interface CategoryService {
	public Category getcategoryByid(int categoryid);
	public List<Category> getallcategory(int page,int pagesize);
	public void updateCategory(Category category);
	public void deleteCategoryById(int categoryid);
}
