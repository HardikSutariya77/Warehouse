package tvm.test;

import tvm.access.ReadInventory;
import tvm.model.Inventory;
import tvm.model.Product;

import java.util.List;

/**
 *
 * @author TVM
 */
public class Test1 extends ReadInventory  {
	public static void main(String[] args) {
		// Print it out the total value of all inventory combined
		// Use  ReadInventory.getInventory() to get the inventory
	     //ReadInventory.getInventory();
		
	     List<Inventory> inventoryList=ReadInventory.getInventory();

		 double totalValue=0;
		 for(Inventory inventory:inventoryList){
			 Product product=inventory.productInStock;
			 totalValue=totalValue+product.costPrice*inventory.quantityInStock;
		 }
		System.out.println("total value of all inventory combined"+":"+totalValue);
		System.out.println("test1 ok");
	}
}
