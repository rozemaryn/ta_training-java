package com.epam.rd.autotasks.triangle;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Segment {
    private final Point beginning;
    private final Point end;

    public Segment (Point point1, Point point2) {
        if (point1.equals(point2) || point1 == null || point2 == null) {
            throw new IllegalArgumentException("The segment is degenerate");
        }
        this.beginning = point1;
        this.end = point2;
    }

    public double length () {
        return sqrt(pow((this.end.getX() - this.beginning.getX()), 2) +
                pow((this.end.getY() - this.beginning.getY()), 2));
    }
}
