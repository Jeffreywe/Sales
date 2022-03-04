package com.maxtrain.bootcamp.sales;

import java.util.ArrayList;

public class Order {

	private static int nextId = 1;
	
	private int id;
	private String description;
	private double total;
	private Customer customer;
	private ArrayList<Orderline> orderLines;
	
	public Order(String description, Customer customer) {
		this.setId(nextId++);
		this.setDescription(description);
		this.setTotal(0);
		this.setCustomer(customer);
		this.orderLines = new ArrayList<Orderline>();
	}
	@Override
	public String toString() {
		return getId() + "|" 
				+ getDescription() + "|" 
				+ getTotal() + "|" 
				+ getCustomer().getName();
	}
	public void log() {
		System.out.println(this);
	}
	
	
	
	
	
	
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public ArrayList<Orderline> getOrderLines() {
		return orderLines;
	}
	
	
}
