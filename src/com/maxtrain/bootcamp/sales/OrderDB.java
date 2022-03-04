package com.maxtrain.bootcamp.sales;

import java.util.ArrayList;

public class OrderDB {

	private ArrayList<Order> orders = new ArrayList<Order>();
	
	public void addOrderline(Order order, Orderline orderline) throws Exception {
		if(order == null) {
			throw new Exception("Missing order instance");
		}
		order.getOrderLines().add(orderline);
	}
	
	//public boolean deleteOrderline
	
	public Order[] getAll() {
		Order[] ord = new Order[orders.size()];
		for(var i = 0; i < orders.size(); i++) {
			ord[i] = orders.get(i);
		}
		return ord;
	}
	
	public Order getByPk(int id) {
		for(var order : orders) {
			if(order.getId() == id) {
				return order;
			}
		}
		return null;
	}
	
	public void add(Order order) {
		orders.add(order);
	}
	
	public boolean delete(int id) {
		var ord = getByPk(id);
		if(ord == null) {
			return false;
		}
		orders.remove(ord);
		return true;
	}
}