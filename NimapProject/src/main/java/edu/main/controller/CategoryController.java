package edu.main.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.main.entity.Category;
import edu.main.service.CategoryService;



@RestController
public class CategoryController {

	@Autowired
	CategoryService cr;
	
	@GetMapping("/api/categories")
	public List<Category> getallcategory(@RequestParam (value = "page",defaultValue = "0",required = false)Integer page){
		return cr.getallcategory(page,1);
	}
	
	@PostMapping("/api/categories")
	public void saveCategories(@RequestBody Category category) {
		cr.updateCategory(category);
	}
	
	@GetMapping("/api/categories/{di}")
	public Category getcategory(@PathVariable("di") int categoryid) {
		return cr.getcategoryByid(categoryid);	
	}
	
	@PutMapping("/api/categories/{di}")
	public void updateCategory(@RequestBody Category category){
		cr.updateCategory(category);		
	}
	
	@DeleteMapping("/api/categories/{di}")
	public void deleteCategoryById(@PathVariable("di") int categoryid) {
		cr.deleteCategoryById(categoryid);
	
	}
	
	
}