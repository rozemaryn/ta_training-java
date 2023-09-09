package com.epam.rd.autotasks.intersection;

public class Line {
    private final int k;
    private final int b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line otherLine) {
        if (this.k == otherLine.k)
            return null;

        int x = (otherLine.b - this.b) / (this.k - otherLine.k);
        int y = this.k * x + this.b;

        return new Point(x, y);
    }
}
