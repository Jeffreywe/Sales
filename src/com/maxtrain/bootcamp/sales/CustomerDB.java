package com.maxtrain.bootcamp.sales;

import java.util.ArrayList;

public class CustomerDB {
//	fixed array
//	private Customer[] customers = new Customer[10];
//	private int index = 0;
	private ArrayList<Customer> customers = new ArrayList<Customer>();

	public void add(Customer customer) throws Exception {
		customers.add(customer);
//		fixed array
//		if (index > 9) {
//			throw new Exception("Collection is full!");
//		}
//		customers[index] = customer;
//		index++;
	}

// 	fixed array, right clicked on findIndex and looked for references, since dead code we dont need it
//	private int findIndex(int id) {
//		for (var i = 0; i < customers.length; i++) {
//			var cust = customers[i];
//			if(cust == null) {
//				continue;
//			}
//			if(cust.getId() == id) {
//				return i;
//			}
//		}
//		return -1;
//	}
	
	public boolean delete(int id) {
		var cust = getByPk(id);
		if(cust == null) {
			return false;
		}
		customers.remove(cust);
// 		fixed array
//		var index = findIndex(id);
//		if(index == -1) {
//			return false;
//		}
//		customers[index] = null;
		return true;
	}

//	public Customer get(int index) throws Exception {
//		if (index < 0 || index > 9) {
//			throw new Exception("Index out of range!");
//		}
//		return customers[index];
//	}

	public Customer getByPk(int id) {
		/*for (var cust : customers) {
			if (cust == null) {
				continue;
			}
			if (cust.getId() == id) {
				return cust;
			}
		}*/
// 		fixed array
//		var index = findIndex(id);
//	    if(index > -1) {
//	    	return customers[index];
//	    }
		for( var cust : customers) {
			if(cust.getId() == id) {
				return cust;
			}
		}
		return null;
	}

	public Customer[] getAllx() {
		var custs = new Customer[customers.size()];
		for(var i = 0; i < customers.size(); i++) {
			custs[i] = customers.get(i);
		}
		return custs;
//		fixed array
//		var custs = new Customer[index];
//		for (var i = 0; i < index; i++) {
//			custs[i] = customers[i];
//		}
//		return custs;
	}

//  coreys get all
//	public void getAll() {
//		for (int i = 0; i < customers.length - 1; i++) {
//			System.out.println(customers[i]);
//		}
//	}

}
