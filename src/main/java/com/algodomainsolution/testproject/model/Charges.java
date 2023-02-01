package com.algodomainsolution.testproject.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="charges")
public class Charges {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="charges_id")
		private int chargesId;
		@Column(name="gst")
		private double gst;
		@Column(name="delivery")
		private double delivery;
		@Column(name="category_ref")
		private int category;
		
		@OneToOne(mappedBy = "charges_ref")
		private ProductInfo product;

		public Charges() {
			super();
		}

		public Charges(int chargesId,double gst, double delivery, ProductInfo product) {
			super();
			this.chargesId=chargesId;
			this.gst = gst;
			this.delivery = delivery;
			this.category=category;
			this.product = product;
		}
		

		public int getChargesId() {
			return chargesId;
		}

		public void setChargesId(int chargesId) {
			this.chargesId = chargesId;
		}

		public double getGst() {
			return gst;
		}

		public void setGst(double gst) {
			this.gst = gst;
		}

		public double getDelivery() {
			return delivery;
		}

		public void setDelivery(double delivery) {
			this.delivery = delivery;
		}
		

		public int getCategory() {
			return category;
		}

		public void setCategory(int category) {
			this.category = category;
		}

		public ProductInfo getProduct() {
			return product;
		}

		public void setProduct(ProductInfo product) {
			this.product = product;
		}

		
}