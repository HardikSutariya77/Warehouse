package tvm.test;

import tvm.access.ReadInventory;
import tvm.model.Inventory;
import tvm.model.InventoryComparator;
import tvm.model.Warehouse;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author TVM
 */
public class Test3
{
    public static void main (String[] args)
    {
        // Sort the inventory records by location as the primary sort and then product as the second sort and print them out
        // In SQL, this is equivalent to:
        // ORDER BY productCode, warehouseCode
        //
        // Use ReadInventory.getInventory() to get the inventory.  The system must be able to cope with new products / locations.

        List<Inventory> inventoryList= ReadInventory.getInventory();

        inventoryList.sort(new InventoryComparator());

        for(Inventory i:inventoryList){
            System.out.println(i);
        }

        System.out.println("test3 ok");
    }
}
