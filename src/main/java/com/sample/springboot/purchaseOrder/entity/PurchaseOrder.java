package com.sample.springboot.purchaseOrder.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
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
@Table(name="purchase_order")
public class PurchaseOrder {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_id")
	private int orderId;
	
	@Column(name="vendor_id")
	private int vendorId;
	
	@Column(name="price")
	private int price;
	
	@Column(name="currency")
	private String currency;
	
	@Column(name="qty_placed")
	private int qtyPlaced;
	
	@Column(name="qty_delivered")
	private int qtyDelivered;
	
	@Column(name="created_at")
	private Timestamp createdAt;
	
	@Column(name="updated_by")
	private int updatedBy;
	
	@Column(name="updated_at")
	private Timestamp updatedAt;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="created_by")
	private User user;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="order_id")
	private List<Invoice> invoices;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="order_id")
	private List<OrderProduct> orderProducts;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
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

	public int getQtyPlaced() {
		return qtyPlaced;
	}

	public void setQtyPlaced(int qtyPlaced) {
		this.qtyPlaced = qtyPlaced;
	}

	public int getQtyDelivered() {
		return qtyDelivered;
	}

	public void setQtyDelivered(int qtyDelivered) {
		this.qtyDelivered = qtyDelivered;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Invoice> getInvoices() {
		return invoices;
	}

	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}

	
	public void addInvoice(Invoice invoice)
	{
		if(invoices==null)
			invoices=new ArrayList<>();
		invoices.add(invoice);
		
	}
	
	public List<OrderProduct> getOrderProducts() {
		return orderProducts;
	}

	public void setOrderProducts(List<OrderProduct> orderProducts) {
		this.orderProducts = orderProducts;
	}

	public void addOrderProduct(OrderProduct orderProd)
	{
		if(orderProducts==null)
			orderProducts=new ArrayList<>();
		orderProducts.add(orderProd);
	}
	
	@Override
	public String toString() {
		return "PurchaseOrder [orderId=" + orderId + ", vendorId=" + vendorId + ", price=" + price + ", currency="
				+ currency + ", qtyPlaced=" + qtyPlaced + ", qtyDelivered=" + qtyDelivered + ", createdBy=" + user
				+ ", createdAt=" + createdAt + ", updatedBy=" + updatedBy + ", updatedAt=" + updatedAt + ", invoices="
				+ invoices + "]";
	}
}
