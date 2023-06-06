package tvm.test;

import tvm.access.ReadInventory;
import tvm.model.Inventory;
import tvm.model.Product;

import java.util.HashSet;
import java.util.List;

/**
 *
 * @author TVM
 */
public class Test2 extends ReadInventory {

	public static void main(String[] args) {
		// Print out the quantity in stock and total value of that stock grouped
		// by product (across all locations) e.g.
		// Knife 20 300
		// Cup 10 100
		// Use ReadInventory.getInventory() to get the inventory. The system
		// must be able to cope with new products.

		List<Inventory> inventoryList=ReadInventory.getInventory();
		HashSet<String> productHashSet=new HashSet<>();


		for(Inventory inventory:inventoryList){
			productHashSet.add(inventory.productInStock.description);
		}
		for(String productName:productHashSet){
			int quantity=0;
			Product product=null;
			for(Inventory inventory:inventoryList){
				if(inventory.productInStock.description.equals(productName)){
					quantity=quantity+inventory.quantityInStock;
					product=inventory.productInStock;
				}
			}
			System.out.println(product.description+" "+quantity+" "+quantity*(int)product.costPrice);
		}
		System.out.println("test 2 ok");
	}
}
