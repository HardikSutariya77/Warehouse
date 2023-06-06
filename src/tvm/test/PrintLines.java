package tvm.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import tvm.access.*;
import tvm.model.*;

/**
 *
 * @author TVM
 */
public class PrintLines
{
    public static void main (String[] args)
    {
        // Summarise the lines into the minimal set of lines that can represent the points
        // e.g. 1 - 20, 15 - 25, and 40 - 50 can be represented as 1 - 25 and 40 - 50.
        // Print out the line
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arg ="";
        try {
             arg = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(PrintLines.class.getName()).log(Level.SEVERE, null, ex);
        }
        String[] arr = arg.split(",");
       
        List<Line>  lines = ReadLines.getLines(arr.length < 1 ? null : arr[1]);

        lines.sort(new LineComparator());

        System.out.println("********************sorted lines*******************");
        for(Line line:lines){
            System.out.println(line);
        }

        Queue<Line> lineQueue=new LinkedList<Line>();

       for(Line line:lines) {
           lineQueue.add(line);
       }

        LinkedList <Line> updatedLines=new LinkedList<>();

        int n=lineQueue.size()-1;
        Line l1=lineQueue.poll();
        Line l2=null;


        while (n>0){
             l2=lineQueue.peek();
             if(l1.lastPointNo>= l2.firstPointNo && l1.lastPointNo <=l2.lastPointNo)
             {
                 l1.lastPointNo=l2.lastPointNo;
                 lineQueue.poll();
                 n--;
             }
             else{
                 updatedLines.add(l1);
                 l1=l2;
                 lineQueue.poll();
                 n--;
             }
        }
        updatedLines.add(l1);
        System.out.println("*************final OutPut**************");
       for(Line l:updatedLines){
           System.out.println(l);
       }

    }
    
     
}
