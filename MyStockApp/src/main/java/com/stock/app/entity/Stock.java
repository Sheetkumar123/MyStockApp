package com.stock.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Sheet Kumar
 *
 */
@Entity
@Table(name = "stock")
@Data
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long stockId;

	@Column(name = "stock_name")
	private String stockName;

	@Column(name = "price_per_unit")
	private double pricePerUnit;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "is_active")
	private boolean isActive;

}
