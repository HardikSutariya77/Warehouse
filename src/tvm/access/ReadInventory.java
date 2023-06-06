/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tvm.access;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import tvm.model.*;

/**
 *
 * @author TVM
 */
public class ReadInventory
{
    public static List<Inventory> getInventory ()
    {
        Warehouse   whPerth = new Warehouse("Perth");
        Warehouse   whSydney = new Warehouse("Sydney");
        Warehouse   whMelbourne = new Warehouse("Melbourne");
        
        Product     prodCups = new Product("CUP", "Cup", 2.0);
        Product     prodPlate = new Product("PL", "Plate", 4.0);
        Product     prodKnife = new Product("KNF", "Knife", 3.0);
        
        List<Inventory>     result = new ArrayList<Inventory>();
        
        result.add(new Inventory(whPerth, "A",  prodCups,       10));
        result.add(new Inventory(whPerth, "B",  prodCups,       20));
        result.add(new Inventory(whPerth, "A",  prodPlate,      5));
        result.add(new Inventory(whPerth, "B",  prodPlate,      15));
        result.add(new Inventory(whPerth, "A",  prodKnife,      30));
        
        result.add(new Inventory(whMelbourne, "M",  prodCups,       5));
        result.add(new Inventory(whMelbourne, "M",  prodPlate,      8));
        
        result.add(new Inventory(whSydney, "C",  prodCups,       9));
        result.add(new Inventory(whSydney, "B",  prodCups,       15));
        result.add(new Inventory(whSydney, "C",  prodPlate,      25));
        result.add(new Inventory(whSydney, "B",  prodKnife,      5));
        result.add(new Inventory(whSydney, "C",  prodKnife,      15));

        Collections.shuffle(result);
        
        return result;
    }
}
