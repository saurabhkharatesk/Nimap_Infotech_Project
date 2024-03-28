package edu.main.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
  @Id
  private int prodId;
  private String prodName;
  private double prodPrice;
  private int prodQuantity;
  
  @ManyToOne(cascade = CascadeType.DETACH.MERGE)
  private Category category;

public int getProdId() {
	return prodId;
}

public void setProdId(int prodId) {
	this.prodId = prodId;
}

public String getProdName() {
	return prodName;
}

public void setProdName(String prodName) {
	this.prodName = prodName;
}

public double getProdPrice() {
	return prodPrice;
}

public void setProdPrice(double prodPrice) {
	this.prodPrice = prodPrice;
}

public int getProdQuantity() {
	return prodQuantity;
}

public void setProdQuantity(int prodQuantity) {
	this.prodQuantity = prodQuantity;
}

public Category getCategory() {
	return category;
}

public void setCategory(Category category) {
	this.category = category;
}

public Product() {
	super();
}

public Product(int prodId, String prodName, double prodPrice, int prodQuantity, Category category) {
	super();
	this.prodId = prodId;
	this.prodName = prodName;
	this.prodPrice = prodPrice;
	this.prodQuantity = prodQuantity;
	this.category = category;
}

@Override
public String toString() {
	return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + ", prodQuantity="
			+ prodQuantity + ", category=" + category + "]";
}
    

}
