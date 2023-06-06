/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tvm.access;

import java.util.*;

import tvm.model.*;

/**
 *
 * @author TVM
 */
public class ReadLines
{
    public static List<Line> getLines (String projectName)
    {
        List<Line>  result = new ArrayList<Line>();
        
        if (projectName.startsWith("A"))
        {
            result.add(new Line(100, 300));
            result.add(new Line(250, 350));
            result.add(new Line(500, 550));
            result.add(new Line(560, 700));
            result.add(new Line(540, 600));
        }
        else if (projectName.startsWith("B"))
        {
            result.add(new Line(100, 300));
            result.add(new Line(290, 450));
            result.add(new Line(360, 550));
            result.add(new Line(600, 700));
            result.add(new Line(740, 900));
        }
        else
        {
            result.add(new Line(1, 20));
            result.add(new Line(20, 25));
            result.add(new Line(40, 50));
            result.add(new Line(51, 70));

             /* result.add(new Line(1,20));
              result.add(new Line(15,25));
              result.add(new Line(25,30));

              result.add(new Line(35,40));

              result.add(new Line(45,60));

              result.add(new Line(70,80));

              result.add(new Line(90,100));

              result.add(new Line(110,120));
              result.add(new Line(105,115));
              result.add(new Line(115,120));

              result.add(new Line(125,140));
              result.add(new Line(160,170));
              result.add(new Line(180,190));*/
        }
        
        Collections.shuffle(result);
        
        return result;
    }
    
    public static void main(String[] args)
    {
    
    	getLines(args[0]);
    	
    }
}
