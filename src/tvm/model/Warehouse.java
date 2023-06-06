/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tvm.model;

/**
 *
 * @author TVM
 */
public class Warehouse
{
    public String warehouseCode;

    public Warehouse(String warehouseCode)
    {
        this.warehouseCode = warehouseCode;
    }

    @Override
    public String toString()
    {
        return warehouseCode;
    }

    public int compareTo(Warehouse location) {
        if(this.warehouseCode.compareTo(location.warehouseCode)<0)
            return -1;
        if(this.warehouseCode.compareTo(location.warehouseCode)>0)
            return +1;
        return 0;
    }
}
