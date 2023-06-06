package tvm.model;

import java.util.Comparator;

public class InventoryComparator implements Comparator<Inventory> {
    @Override
    public int compare(Inventory o1, Inventory o2) {
        int comparison=0;
        comparison=o1.location.compareTo(o2.location);
        if(comparison==0)
        {
            comparison=o1.productInStock.compareTo(o2.productInStock);
        }
        return comparison;
    }
}
