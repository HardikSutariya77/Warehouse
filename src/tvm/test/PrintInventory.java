package tvm.test;

import tvm.model.Inventory;
import tvm.model.Product;

import java.util.List;

import static tvm.access.ReadInventory.getInventory;

/**
 *
 * @author TVM
 */
public class PrintInventory
{
    public static void main (String[] args)
    {
    	/*
    	 * 1. Read All Inventory-Records.. 
    	 * 2. Print each Product's Location, Code, Qty, Price
    	 */

        List<Inventory> inventoryList=getInventory();
        for(Inventory inventory:inventoryList){
            Product product=inventory.productInStock;
            System.out.println(inventory.location+" "+product.productCode+" "+inventory.quantityInStock+" "+product.costPrice);

        }
        System.out.println("printInventory ok");

    }
}
