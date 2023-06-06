package tvm.test;

import tvm.access.ReadLines;
import tvm.model.Line;
import tvm.model.LineComparator;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author TVM
 */
public class Test6
{
    public static void main (String[] args)
    {        
        // A tvm.model.Line is an interval between two points. Each point is represented by an integer.
        // Get the lines using ReadLines.getLines (args.length > 0 ? args[0] : "")
        //
        // Summarise the lines into the minimal set of lines that can represent the points.
        // Lines can be combined if their points overlap.
        // For example, the line from points 1 - 20 and the line from points 15 - 25 overlap and can be combined into 1 - 25.
        // The line 1 - 20 and 20 - 25 DO overlap, 
        // The line 1 - 20 an 21 - 25  DO NOT overlap, 
        // e.g. 1 - 20, 15 - 25, and 40 - 50 can be represented as 1 - 25 and 40 - 50.
        //
        // Print out the lines after they have been summarised.

        List<Line> lines= ReadLines.getLines (args.length > 0 ? args[0] : "");

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
