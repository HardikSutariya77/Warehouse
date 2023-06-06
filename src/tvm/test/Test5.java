package tvm.test;

import tvm.access.ReadLines;
import tvm.model.Line;
import tvm.model.LineComparator;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author TVM
 */
public class Test5 {
	public static void main(String[] args) {
		// A tvm.model.Line is an interval between two points. Each point is
		// represented by an integer.
		// Sort the Spatial tvm.model.Line objects by the first point number
		// (refer to PrintLines.java). Same as:
		// ORDER BY firstPointNo
		//
		// Get the lines using ReadLines.getLines (args.length > 0 ? args[0] :
		// "")

		List<Line> lines = ReadLines.getLines(args.length >0 ? args[0] : "");


		/*sorting lines*/
		lines.sort(new LineComparator());

		/*printing line*/
		for(Line l:lines){
			System.out.println(l);
		}
	}
}
