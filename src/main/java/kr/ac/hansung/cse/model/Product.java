package kr.ac.hansung.cse.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "productTable")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4577239542252345341L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "category")
	private String category;

	@Column(name = "price")
	private int price;

	@Column(name = "manufacturer")
	private String manufacturer;
	
	@Column(name = "unitInStock")
	private int unitInStock;
	
	@Column (name = "description")
	private String description;
	
	public Product(long id, String name, String category, int price, String manufacturer, int unitInStock, String description) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.manufacturer = manufacturer;
		this.unitInStock = unitInStock;
		this.description = description;
	}

	

}