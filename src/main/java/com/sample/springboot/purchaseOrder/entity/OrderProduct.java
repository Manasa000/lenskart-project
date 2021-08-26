package com.sample.springboot.purchaseOrder.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_product")
public class OrderProduct {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_id")
	private int orderId;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_id")
	private int productId;
	
	@Column(name="qty_placed")
	private int qtyPlaced;
	
	@Column(name="qty_delivered")
	private int qtyDelivered;
	
	@Column(name="created_by")
	private int createdBy;
	
	@Column(name="created_at")
	private Timestamp createdAt;
	
	@Column(name="updated_by")
	private int updatedBy;
	
	@Column(name="updated_at")
	private Timestamp updatedAt;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
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
		return "OrderProduct [orderId=" + orderId + ", productId=" + productId + ", qtyPlaced=" + qtyPlaced
				+ ", qtyDelivered=" + qtyDelivered + ", createdBy=" + createdBy + ", createdAt=" + createdAt
				+ ", updatedBy=" + updatedBy + ", updatedAt=" + updatedAt + "]";
	}
	
}
