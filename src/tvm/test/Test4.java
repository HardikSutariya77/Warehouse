package tvm.test;

import tvm.access.ReadInventory;
import tvm.model.Inventory;
import tvm.model.Product;
import tvm.model.Warehouse;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author TVM
 */
public class Test4
{
    public static void main (String[] args)
    {
        // Print out the records, grouped by location, with totals and sub totals e.g.
        // Perth
        //      Knife        20     300
        //      Cup          10     100
        //                   30     400
        // Melbourne
        //    etc.
        // No formatting is required.
        //
        // Use ReadInventory.getInventory() to get the inventory.  The system must be able to cope with new products / locations.


        List<Inventory> inventoryList= ReadInventory.getInventory();
        Set<Warehouse> warehouseSet= new HashSet<>();
        Set<Product>  productSet=new HashSet<>();
        HashMap<Product,Integer> productQuantityHashMap = new HashMap<>();

        for(Inventory inventory:inventoryList){
            warehouseSet.add(inventory.location);
            productSet.add(inventory.productInStock);
        }

        for(Warehouse warehouse:warehouseSet)
        {
            int totalQnt=0;
            int totalCost=0;
            System.out.println(warehouse);
            for(Product product:productSet)
            {
                int quantity=0;
                for(Inventory inventory:inventoryList)
                {
                    if(inventory.productInStock==product && inventory.location==warehouse)
                    {
                        quantity=quantity+inventory.quantityInStock;
                    }
                }
                if(quantity==0) continue;
                System.out.println(product.description+"  "+quantity+"  "+quantity*(int)product.costPrice);
                totalQnt=totalQnt+quantity;
                totalCost=totalCost+quantity*(int)product.costPrice;
            }
            System.out.println(totalQnt+" "+totalCost);
        }

        System.out.println("test 4 ok");

    }
}


//0 quantity should not be printed implement it