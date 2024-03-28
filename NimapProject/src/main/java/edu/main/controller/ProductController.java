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

import edu.main.entity.Product;
import edu.main.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService ps;
	
	
	@GetMapping("/api/products")
	public List<Product> getallproduct(@RequestParam(value = "page",defaultValue = "0",required = false)Integer page){
		return ps.getallprod(page,1);
	}
	
	@PostMapping("/api/products")
	public Product saveProducts(@RequestBody Product product) {
		return ps.updateProd(product);
	}
	
	@GetMapping("/api/products/{di}")
	public Product getproduct(@PathVariable("di") int productId) {
		return ps.getprodByid(productId);
	}
	
	@PutMapping("/api/products/{di}")
	public void updateproduct(@RequestBody Product product){
		ps.updateProd(product);
    }
	
	@DeleteMapping("/api/products/{di}")
	public void deleteProduct(@PathVariable("di") int productId) {
		ps.deleteprod(productId);
	
	}
	
}
