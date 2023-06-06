/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tvm.model;

/**
 *
 * @author TVM
 */
public class Product
{
    public String   productCode;
    public String   description;
    public double   costPrice;

    public Product(String productCode, String description, double costPrice)
    {
        this.productCode = productCode;
        this.description = description;
        this.costPrice = costPrice;
    }

    @Override
    public String toString()
    {
        return productCode;
    }


    public int compareTo(Product productInStock) {
        if(this.productCode.compareTo(productInStock.productCode)<0)
            return -1;
        if(this.productCode.compareTo(productInStock.productCode)>0)
            return +1;
        return 0;
    }
}
