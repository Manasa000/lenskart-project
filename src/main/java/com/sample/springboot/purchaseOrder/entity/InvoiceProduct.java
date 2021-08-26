package com.sample.springboot.purchaseOrder.entity;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="invoice_product")
public class InvoiceProduct {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="invoice_id")
	private Invoice invoiceId;
	
	@Column(name="product_id")
	private int productId;
	
	@Column(name="qty")
	private int qty;
	
	@Column(name="price")
	private int price;
	
	@Column(name="currency")
	private String currency;
	
	@Column(name="created_by")
	private int createdBy;
	
	@Column(name="created_at")
	private Timestamp createdAt;
	
	@Column(name="updated_by")
	private int updatedBy;
	
	@Column(name="updated_at")
	private Timestamp updatedAt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Invoice getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Invoice invoiceId) {
		this.invoiceId = invoiceId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public int getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "InvoiceProduct [id=" + id + ", invoiceId=" + invoiceId + ", productId=" + productId + ", qty=" + qty
				+ ", price=" + price + ", currency=" + currency + ", createdBy=" + createdBy + ", createdAt="
				+ createdAt + ", updatedBy=" + updatedBy + ", updatedAt=" + updatedAt + "]";
	}
	
	

}
