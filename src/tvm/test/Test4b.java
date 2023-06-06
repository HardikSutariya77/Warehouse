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
public class Test4b
{
    public static void main (String[] args)
    {
        // Print out the records, grouped by location, with totals and sub totals e.g.
        // Perth
        //      Knife        20     $300
        //      Cup          10     $100
        //      Plate     1,000   $1,000
        // -----------------------------
        //                1,430   $1,400
        // -----------------------------
        //
        // Melbourne
        //    etc.
        // Formatting is important.  It is important that the right of the numbers align and that numbers are represented with , and $ where appropriate

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
                String eachProductWithTotalQuantityCost=Integer.toString((int)quantity*(int)product.costPrice);
                eachProductWithTotalQuantityCost="$"+eachProductWithTotalQuantityCost;
                System.out.printf("%-10s%10d%10s\n",product.description,quantity,eachProductWithTotalQuantityCost);
                totalQnt=totalQnt+quantity;
                totalCost=totalCost+(int)quantity*(int)product.costPrice;
            }
            String totalPrice="$"+Integer.toString(totalCost);
            System.out.println("--------------------------------------");
            System.out.printf("%20d%10s\n",totalQnt,totalPrice);
            System.out.println("--------------------------------------");
        }

        System.out.println("test 4b ok");

    }
}
