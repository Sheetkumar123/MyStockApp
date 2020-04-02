
package com.stock.app.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Sheet kumar
 *
 */
@Entity
@Table(name = "user_stocks")
@Data
public class UserStocks {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long userStocksID;

	@ManyToOne(optional = true, cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private User users;

	@ManyToOne(optional = true, cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinColumn(name = "stock_id", referencedColumnName = "id")
	private Stock stocks;

	@Column(name = "stock_name")
	private String stockName;

	@Column(name = "total_quantity")
	private double totalQuantity;

	@Column(name = "total_price")
	private double totalPrice;

	@Column(name = "purchased_on")
	private Date purchasedOn;
	
}
