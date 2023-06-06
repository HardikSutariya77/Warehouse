/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tvm.model;

/**
 *  Lines are continuous collections of points e.g. 5, 6, 7, 8, 9.  We represent this line as 5 - 9
 */
public class Line
{
    public int     firstPointNo;
    public int     lastPointNo;

    public Line(int firstPointNo, int lastPointNo)
    {
        this.firstPointNo = firstPointNo;
        this.lastPointNo = lastPointNo;
    }

    @Override
    public String toString() {
        return "Line{" +
                "firstPointNo=" + firstPointNo +
                ", lastPointNo=" + lastPointNo +
                '}';
    }


    public int compareTo(Line o2) {
        
        if(this.firstPointNo>o2.firstPointNo)
            return +1;
        if(this.firstPointNo<o2.firstPointNo)
            return -1;
        return 0;
    }
}
