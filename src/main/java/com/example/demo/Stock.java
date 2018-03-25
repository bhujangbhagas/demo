package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "stock")
@Table(name = "stock")
class Stock {

	@Id
	@Column(name = "STOCK_ID", length = 32, unique = true, nullable = false)
	private Integer stockId;

	@Column(name = "STOCK_CD", length = 256)
	private String stockCode;

	@Column(name = "STOCK_NM", length = 256)
	private String stockName;

	public Stock() {
		super();
	}

	public Stock(String stockName, String stockCode) {
		super();
		this.stockName = stockName;
		this.stockCode = stockCode;
	}

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

}