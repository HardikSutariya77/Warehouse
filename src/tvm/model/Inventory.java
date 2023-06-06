/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tvm.model;

/**
 * 
 * @author TVM
 */
public class Inventory {
	/**
	 * Warehouse this inventory is within
	 */
	public Warehouse location;

	/**
	 * Location within the warehouse
	 */
	public String rack;

	/**
	 * Product at this location
	 */
	public Product productInStock;

	/**
	 * Number of units in stock
	 */
	public int quantityInStock;

	public Inventory(Warehouse location, String rack, Product productInStock,
			int quantityInStock) {
		this.location = location;
		this.rack = rack;
		this.productInStock = productInStock;
		this.quantityInStock = quantityInStock;
	}

	public void delete() {
		System.out.println("Deleting Inventory Record:" + location + "." + rack
				+ " item:" + productInStock);
	}

	public double getStock() {
		if (productInStock != null) {
			return productInStock.costPrice * quantityInStock;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Inventory{" +
				"location=" + location +
				", rack='" + rack + '\'' +
				", productInStock=" + productInStock +
				", quantityInStock=" + quantityInStock +
				'}';
	}
}
