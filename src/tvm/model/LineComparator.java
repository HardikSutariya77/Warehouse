package tvm.model;

import java.util.Comparator;

public class LineComparator implements Comparator<Line> {
    @Override
    public int compare(Line o1, Line o2) {
        int comparison=0;
        comparison=o1.compareTo(o2);
        return comparison;
    }
}
