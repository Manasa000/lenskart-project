package com.sample.springboot.purchaseOrder.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="invoice")
public class Invoice {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="invoice_id")
	private int invoiceId;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="order_id")
	@Column(name="order_id")
	private PurchaseOrder orderId;
	
	@Column(name="vendor_id")
	private int vendorId;
	
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
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="invoice_id")
	private List<InvoiceProduct> InvoiceProducts;

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public PurchaseOrder getOrderId() {
		return orderId;
	}

	public void setOrderId(PurchaseOrder orderId) {
		this.orderId = orderId;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
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

	public List<InvoiceProduct> getInvoiceProducts() {
		return InvoiceProducts;
	}

	public void setInvoiceProducts(List<InvoiceProduct> invoiceProducts) {
		InvoiceProducts = invoiceProducts;
	}

	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", orderId=" + orderId + ", vendorId=" + vendorId + ", qty=" + qty
				+ ", price=" + price + ", currency=" + currency + ", createdBy=" + createdBy + ", createdAt="
				+ createdAt + ", updatedBy=" + updatedBy + ", updatedAt=" + updatedAt + ", InvoiceProducts="
				+ InvoiceProducts + "]";
	}
	
}
